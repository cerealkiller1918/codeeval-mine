package com.justinfrasier.codeeval.trickOrTreat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(trickOrTreat(line));
        }
    }


    public static String trickOrTreat(String input){
        String[][] strings = breakDown(input);
        int amountOfCandies = totalAmountOfCandies(strings);
        int amountOfKids = totalAmountOfKids(strings);
        int amountOfHouses = amountOfHouse(strings);
        int totalCandies = amountOfCandies * amountOfHouses;
        int output = totalCandies / amountOfKids;
        return String.valueOf(output);
    }

    private static int candies(String costumes, String amount){
        int amt = Integer.parseInt(amount);
        int m=0;
        if(costumes.equals("Vampires")) m = 3;
        else if(costumes.equals("Zombies")) m = 4;
        else if(costumes.equals("Witches")) m =5;
        else if(costumes.equals("Houses")) m = 1;
        return amt * m ;
    }

    private static String[][] breakDown(String input){
        String[] strings = input.split(", ");
        String[] vampires = strings[0].split(": ");
        String[] zombies = strings[1].split(": ");
        String[] witches = strings[2].split(": ");
        String[] houses = strings[3].split(": ");
        String[][] output = {vampires,zombies,witches,houses};
        return output;
    }

    private static int totalAmountOfKids(String[][] strings){
        int amountOfKids = 0;
        for(int i = 0; i < strings.length-1; i++){
            amountOfKids += Integer.parseInt(strings[i][1]);
        }
        return amountOfKids;
    }

    private static int amountOfHouse(String[][] strings){
        int x = 0;
        for(int i = 0; i < strings.length; i++){
            if(strings[i][0].equals("Houses")) x = Integer.parseInt(strings[i][1]);
        }
        return x;
    }

    private static int totalAmountOfCandies(String[][] strings){
        ArrayList<Integer> sums = new ArrayList<Integer>();
        for(int i= 0; i < strings.length-1; i++){
            sums.add(candies(strings[i][0],strings[i][1]));
        }
        int total = 0;
        for (int i : sums ) total += i;
        return total;
    }

}
