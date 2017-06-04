package com.justinfrasier.codeeval.rollerCoaster;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            System.out.println(roller(line.trim()));
        }
    }

    public static String roller(String input){
        String[] strings = input.split("");
        char[] chars = new char[strings.length];
        for(int i=0; i<strings.length;i++) chars[i] = strings[i].charAt(0);
        return new String(camelcase(chars));
    }

    private static Boolean ifOdd(int count){
        if(count%2 != 0)return true;
        else return false;
    }

    private static boolean ifLetter(int dec){
        if(dec > 64 && dec < 91) return true;
        else if (dec > 96 && dec < 123) return true;
        else  return false;
    }

    private static char[] camelcase(char[] chars){
        int letterCounter = 1;
        for(int i=0; i < chars.length; i++){
            if(ifLetter(chars[i])) {
                if (ifOdd(letterCounter)) chars[i] = Character.toUpperCase(chars[i]);
                letterCounter ++;
            }
        }
        return chars;
    }


}
