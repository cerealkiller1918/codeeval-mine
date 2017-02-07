package com.justinfrasier.codeeval.longestword;

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
            System.out.println(getLongestWord(line.trim()));
        }
    }

    public static String getLongestWord(String input) {
        String[] strings = input.split(" ");
        String longest = "";
        for(String s : strings){
            if(s.length() > longest.length()) longest = s;
        }
        return longest;
    }
}
