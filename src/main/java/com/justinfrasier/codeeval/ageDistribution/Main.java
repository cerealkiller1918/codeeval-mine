package com.justinfrasier.codeeval.ageDistribution;


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
            System.out.println(age(line.trim()));
        }
    }


    public static String age(String input) {
        int age = Integer.parseInt(input);
        if (age < 0 || age > 100) return "This program is for humans";
        if (age <= 2) return "Still in Mama's arms";
        else if (age <= 4) return "Preschool Maniac";
        else if (age <= 11) return "Elementary school";
        else if (age <= 14) return "Middle school";
        else if (age <= 18) return "High school";
        else if (age <= 22) return "College";
        else if (age <= 65) return "Working for the man";
        else return "The Golden Years";
    }
}