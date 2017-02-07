package com.justinfrasier.codeeval.calculatedistance;

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
            System.out.println(calculate(line.trim()));
        }
    }

    public static String calculate(String input) {
        String[] s = input.trim().split("\\) \\(");
        s[0] = s[0].replaceFirst("\\(","");
        s[1] = s[1].replaceFirst("\\)", "");
        String[] num1 = s[0].split(", ");
        String[] num2 = s[1].split(", ");
        int output = getDistance(Integer.parseInt(num1[0].trim()),Integer.parseInt(num1[1].trim()),
                 Integer.parseInt(num2[0].trim()),Integer.parseInt(num2[1]));
        return String.valueOf(output);
    }
    
    public static int getDistance(int x1, int y1, int x2, int y2){
        int x = x2 - x1;
        int y = y2 - y1;
        int num = (x*x)+(y*y);
        return (int) Math.sqrt(num);
    }
}
