package com.justinfrasier.codeeval.stringAndArrows;

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
            System.out.println(findArrows(line));
        }
    }
    public static String findArrows(String input){
        int count = 0;
        for(int i=5; i< input.length()+1; i++){
            String temp = input.substring(i-5,i);
            if(temp.equals(">>-->")) count++;
            if(temp.equals("<--<<")) count++;
        }
        return String.valueOf(count);
    }
}
