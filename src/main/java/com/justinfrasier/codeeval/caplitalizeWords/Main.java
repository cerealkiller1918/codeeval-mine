package com.justinfrasier.codeeval.caplitalizeWords;

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
            line = line.trim();
            System.out.println(caplitalize(line));
        }
    }
    public static   String caplitalize(String input){
        String[] strings = input.split(" ");
        String output = "";
        for(String s : strings){
            String first = String.valueOf(s.charAt(0));
            String temp = first.toUpperCase()+s.substring(1, s.length());
            output += temp+" ";
        }
        return output.trim();
    }
}
