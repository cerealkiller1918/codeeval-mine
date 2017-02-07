package com.justinfrasier.codeeval.roadtrip;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args)throws IOException{
        File file = new File(args[0]);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while((line = bufferedReader.readLine()) !=null){
            System.out.println(trip(line.trim()));
        }
    }


    public static String trip(String input) {
        String[] strings = input.trim().split(";");
        List<Integer> mileage = new ArrayList<Integer>();
        //List<Integer> mileageInOrder = new ArrayList<Integer>();
        for(String s: strings) mileage.add(Integer.parseInt(s.trim().split(",")[1]));
        Collections.sort(mileage);
        String output = String.valueOf(mileage.get(0)+",");
        for(int i=1; i<mileage.size();i++){
            int temp = mileage.get(i) - mileage.get(i-1);
            if(i < mileage.size()-1) output+= String.valueOf(temp+",");
            else output+= String.valueOf(temp);
        }

        return output;
    }
}
