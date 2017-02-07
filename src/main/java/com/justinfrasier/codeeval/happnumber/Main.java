package com.justinfrasier.codeeval.happnumber;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException{
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(happyNumber(line));
        }
    }


    public static String happyNumber(String s) {
        List<Character> number = inputStingGetCharList(s);

        int i =0;
        int stopPoint = 1000;
        while(true){
            if(i > stopPoint)return "0";
            String s1 = mathIThink(number);
            if(s1.equals("1"))return "1";
            number = inputStingGetCharList(s1);
            i++;
        }

    }

    public static int squareANumber(String number){
        int temp = Integer.parseInt(number);
        return temp * temp;
    }

    public static List<Character> inputStingGetCharList(String inputString){
        List<Character> characterList = new ArrayList<Character>();
        for(int i =0; i < inputString.length(); i++){
            characterList.add(inputString.charAt(i));
        }
        return characterList;
    }

    public static String mathIThink(List<Character> c){
        int sum = 0;
        List<Integer> numbers = new ArrayList<Integer>();
        for(char i:c){
            sum += squareANumber(""+i);
        }
        return String.valueOf(sum);
    }
}
