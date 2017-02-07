package com.justinfrasier.codeeval.reversewords;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args)throws IOException {
        File file = new File(args[0]);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while((line = bufferedReader.readLine()) !=null){
            System.out.println(reverse(line.trim()));
        }
    }


    public static String reverse(String input) {
        String[] strings = input.split(" ");
        StringBuilder builder = new StringBuilder();
        for(int i = strings.length -1; i > -1; i--){
            builder.append(strings[i]+" ");
        }
        return builder.toString().trim();
    }
}
