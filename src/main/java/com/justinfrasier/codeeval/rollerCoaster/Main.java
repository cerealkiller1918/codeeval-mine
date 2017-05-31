package com.justinfrasier.codeeval.rollerCoaster;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Justin on 05/31/17.
 */
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
        for(int i=0; i<strings.length;i++){chars[i] = strings[i].charAt(0);}



        return "";
    }
}
