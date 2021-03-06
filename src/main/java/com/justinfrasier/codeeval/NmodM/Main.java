package com.justinfrasier.codeeval.NmodM;

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
            System.out.println(mod(line.trim()));
        }
    }

    public static String mod(String input){
        String[] strings = input.split(",");
        int n = Integer.parseInt(strings[0]);
        int m = Integer.parseInt(strings[1]);
        int current = n;
        while(Math.abs(current) >= Math.abs(m)){
            current-= m;
        }
        return String.valueOf(current);
    }

}
