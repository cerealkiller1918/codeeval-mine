package com.justinfrasier.codeeval.hiddenDigits;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(hidden(line));
        }
    }

    public static String hidden(String input){
        char[] chars = input.toCharArray();
        String output = "";
        for(char c : chars){
            if(c > 47 && c < 58) output += c;
            if(c > 96 && c < 107) output += findHiddenNumberValue(c);
        }
        if(output.equals(""))return "NONE";
        else return output;
    }

    private static String findHiddenNumberValue(char c){
        switch (c){
            case 'a': return "0";
            case 'b': return "1";
            case 'c': return "2";
            case 'd': return "3";
            case 'e': return "4";
            case 'f': return "5";
            case 'g': return "6";
            case 'h': return "7";
            case 'i': return "8";
            case 'j': return "9";
            default: return "";
        }
    }
}
