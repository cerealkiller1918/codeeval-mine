package com.justinfrasier.codeeval.findAWriter;

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
            System.out.println(findWriter(line.trim()));
        }
    }

    public static String findWriter(String input){
        String[] strings = input.split("\\|");
        char[]  chars = strings[0].toCharArray();
        int[] ints =stringToIntArray(strings[1]);

        String output= "";
        for(int i: ints){
            output+= chars[i-1];
        }
        return output;
    }

    private static int[] stringToIntArray(String input){
        String[] strings = input.trim().split(" ");
        int[] ints = new int[strings.length];
        for(int i=0; i<strings.length; i++){
            ints[i] = Integer.parseInt(strings[i]);
        }
        return ints;
    }
}
