package com.justinfrasier.codeeval.blackcard;


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
            System.out.println(blackCard(line.trim()));
        }
    }

    public static String blackCard(String input) {
        String[] strings = input.split("\\|");
        int number = Integer.parseInt(strings[1].trim());
        List<String> names = new ArrayList<String>();
        for(String s:strings[0].split(" ")) names.add(s);
        int count = 0;
        int index = 0;
        while(names.size()>1){
           count ++;
           if(count == number){
               count = 0;
               names.remove(index);
               index=0;
           }else index++;
           index %= names.size();
        }
        return names.get(0);
    }
}
