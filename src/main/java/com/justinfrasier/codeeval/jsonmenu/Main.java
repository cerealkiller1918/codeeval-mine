package com.justinfrasier.codeeval.jsonmenu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException{
        File file = new File(args[0]);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while((line = bufferedReader.readLine()) !=null){
            System.out.println(idSum(line.trim()));
        }
    }


    public static String idSum(String input) {
        int sum = 0;
        Pattern pattern = Pattern.compile("\"id\": (\\d+), \"label\"");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find())
            sum+= Integer.parseInt(matcher.group(1));

        return String.valueOf(sum);
    }
}
