package com.justinfrasier.codeeval.emailValidation;

import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            System.out.println(emailChecker(line.trim()));
        }
    }

    public static String emailChecker(String input) {
        boolean sign =false, dot=false;
        char[] chars = stringToCharArray(input);
        for(char c: chars){
            if(isAtSign(c)) sign = !sign;
            if(isADot(c)) dot = !dot;
        }
        if(sign && dot) return "true";
        else return "false";
    }

    private static char[] stringToCharArray(String input){
        String[] strings = input.split("");
        char[] chars = new char[strings.length];
        for(int i=0; i<strings.length;i++) chars[i] = strings[i].charAt(0);
        return chars;
    }

    private static boolean isAtSign(char check){
        if(check == '@') return true;
        else return false;
    }

    private static boolean isADot(char check){
        if(check == '.') return true;
        else return false;
    }
}
