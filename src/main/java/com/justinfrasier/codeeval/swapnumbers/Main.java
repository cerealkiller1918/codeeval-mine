package com.justinfrasier.codeeval.swapnumbers;


import java.util.ArrayList;
import java.io.*;

public class Main {

    public static void main(String[] args)throws IOException{
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(swapNumbers(line));
        }
    }

    public static String swapNumbers(String input){
        String[] strings = input.split(" ");
        ArrayList<String> swapped = new ArrayList<String>();
        for(String s : strings){
            String temp = s.charAt(s.length()-1)+getWord(s)+s.charAt(0);
            swapped.add(temp);
        }
        return returnToFullString(swapped);
    }


    private static String getWord(String s){
        String temp ="";
        for(int i=1; i< s.length()-1; i++){
            temp += s.charAt(i);
        }
        return temp;
    }

    private static String returnToFullString(ArrayList<String> list){
        String output = "";
        for(int i = 0; i < list.size(); i++){
            output += list.get(i)+ " ";
        }
        return output.trim();
    }
}
