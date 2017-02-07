package com.justinfrasier.codeeval.deltatime;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException{
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(getDeltaTime(line));
        }
    }

    public static String getDeltaTime(String input) {
        String[] split = input.split(" ");
        StringBuilder output = new StringBuilder();
        if(split.length == 2){
            String[] firstTime = split[0].split(":");
            String[] secondTime = split[1].split(":");
            List<Integer> firstTimeInt = new ArrayList<Integer>();
            List<Integer> secondTimeInt = new ArrayList<Integer>();
            for(String s:firstTime) {
                firstTimeInt.add(Integer.parseInt(s.trim()));
            }
            for (String s:secondTime) {
                secondTimeInt.add(Integer.parseInt(s.trim()));
            }

            int[] tempOutput = new  int[firstTimeInt.size()];
            if(firstTimeInt.get(0) > secondTimeInt.get(0)){
                getTheOutputOfTheLagerNumber(firstTimeInt, secondTimeInt, tempOutput);
            }else if (secondTimeInt.get(0) > firstTimeInt.get(0)){
                getTheOutputOfTheLagerNumber(secondTimeInt, firstTimeInt, tempOutput);
            }else if(firstTimeInt.get(0) == secondTimeInt.get(0)){
                if(firstTimeInt.get(1) >  secondTimeInt.get(1)){
                    getTheLagerLastNumber(firstTimeInt, secondTimeInt, tempOutput);
                    tempOutput[1] = firstTimeInt.get(1) - secondTimeInt.get(1);
                }
                if(firstTimeInt.get(1) <  secondTimeInt.get(1)){
                    if(firstTimeInt.get(2)< secondTimeInt.get(2)){
                        tempOutput[2] =  secondTimeInt.get(2) - firstTimeInt.get(2);
                    }else{
                        secondTimeInt.set(1,(secondTimeInt.get(1)-1));
                        secondTimeInt.set(2,(secondTimeInt.get(2)+60));
                        tempOutput[2] =  secondTimeInt.get(2) - firstTimeInt.get(2);
                    }
                    tempOutput[1] =  secondTimeInt.get(1) - firstTimeInt.get(1);
                }
            }
            int x = 0;
            for (int i:tempOutput) {
                if(i<10) output.append("0"+i);
                else output.append(i);
                x ++;
                if (x < tempOutput.length){
                    output.append(':');
                }
            }
        }
        return output.toString();
    }

    private static void getTheLagerLastNumber(List<Integer> firstTimeInt, List<Integer> secondTimeInt, int[] tempOutput) {
        if(firstTimeInt.get(2)> secondTimeInt.get(2)){
            tempOutput[2] = firstTimeInt.get(2) - secondTimeInt.get(2);
        }else{
            firstTimeInt.set(1,(firstTimeInt.get(1)-1));
            firstTimeInt.set(2,(firstTimeInt.get(2)+60));
            tempOutput[2] = firstTimeInt.get(2) - secondTimeInt.get(2);
        }
    }

    private static void getTheOutputOfTheLagerNumber(List<Integer> firstTimeInt, List<Integer> secondTimeInt, int[] tempOutput) {
        getTheLagerLastNumber(firstTimeInt, secondTimeInt, tempOutput);
        if(firstTimeInt.get(1) > secondTimeInt.get(1)){
            tempOutput[1] = firstTimeInt.get(1) - secondTimeInt.get(1);
        }else {
            firstTimeInt.set(0,(firstTimeInt.get(0) -1));
            firstTimeInt.set(1,(firstTimeInt.get(1)+60));
            tempOutput[1] = firstTimeInt.get(1) - secondTimeInt.get(1);
        }
        tempOutput[0] = firstTimeInt.get(0) - secondTimeInt.get(0);
    }

    public static String Delta(String text) throws ParseException {
        String[] strings = text.trim().split(" ");
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date time1 = format.parse(strings[0]);
        Date time2 = format.parse(strings[1]);
        long delta;
        long one = time1.getTime();
        long two = time2.getTime();

        if(one  > two) {
            delta = one - two;
        }else{
            delta = two - one;
        }
        String output = format.format(delta);
        return output;
    }

}