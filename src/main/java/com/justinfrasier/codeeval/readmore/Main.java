package com.justinfrasier.codeeval.readmore;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            System.out.println(readMore(line.trim()));
        }
    }

    public static String readMore(String input) {
        StringBuilder builder = new StringBuilder(input);
        builder = checkForDoubleSpaces(builder);
        if(builder.length() <= 55) return builder.toString();
        else{
            return Shorten(builder);
        }
    }

    private static String Shorten(StringBuilder builder) {
        int index = findingTheLastWord(builder);
        builder.delete(index,builder.length());
        builder = trimString(builder);
        builder.append("... <Read More>");
        return builder.toString();
    }

    private static StringBuilder trimString(StringBuilder builder){
       String temp = builder.toString();
       return new StringBuilder(temp.trim());
    }

    private static int findingTheLastWord(StringBuilder builder){
        String[] strings = builder.toString().split("");
        int num = 0;
        for(int i = 36; i < strings.length ;i++) {
            if(strings[i].contains(" ")){
                num = i;
                break;
            }
        }
        return (num + 1);
    }

    private static StringBuilder checkForDoubleSpaces(StringBuilder builder){
        String[] strings = builder.toString().split("");
        List<String> list = new ArrayList<String>();
        for(String i: strings) list.add(i);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).contains(" "))
                if (list.get(i+1).contains(" ") || list.get(i-1).contains(" "))
                    list.remove(i);
        }
        StringBuilder output = new StringBuilder();
        for(String i : list) output.append(i);
        return output;
    }

}
