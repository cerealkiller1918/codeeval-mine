package com.justinfrasier.codeeval.maxRangeSum;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            System.out.println(sum(line.trim()));
        }
    }

    public static String sum(String input) {
        String[] strings = input.split(";");
        int count = Integer.valueOf(strings[0]);
        String[] numString = strings[1].split(" ");
        int[] ints = stringArrayToIntArray(numString);
        int runs = numberOfRuns(count,ints);
        ArrayList<Integer> sumList =  getAllSums(count, ints, runs);
        return String.valueOf(getLargestSum(sumList));
    }

    private static int getLargestSum(ArrayList<Integer> list){
        int maxSum = list.get(0);
        for (int i:list)if(i>maxSum)maxSum=i;
        if(maxSum<0)maxSum=0;
        return maxSum;
    }

    private static ArrayList<Integer> getAllSums(int count, int[] ints, int runs) {
        ArrayList<Integer> sumList = new ArrayList<Integer>();
        for(int i=0; i<=runs; i++){
            sumList.add(getSum(i,count,ints));
        }
        return sumList;
    }

    private static int numberOfRuns(int numberOfDays, int[] array){
        return array.length - numberOfDays;
    }

    private static int getSum(int start, int run, int[] array){
        int sum=0;
        for(int i = start; i < run+start; i++){
            sum += array[i];
        }
        return sum;
    }

    private static int[] stringArrayToIntArray(String[] strings){
        int[] temp = new int[strings.length];
        for(int i=0; i < strings.length; i++)
            temp[i] = Integer.parseInt(strings[i]);
        return temp;
    }
}
