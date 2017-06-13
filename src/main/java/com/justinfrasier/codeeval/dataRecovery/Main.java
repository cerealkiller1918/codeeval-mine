package com.justinfrasier.codeeval.dataRecovery;

public class Main {

    public String recovery(String input){
        String[] words = data(input);
        int[] keys = key(input);
        String output ="";
        for(int i: keys){
            output += words[i-1]+" ";
        }
        return output.trim();
    }
    private String[] data(String input){
        String[] strings = input.split(";");
        return strings[0].split(" ");
    }

    private int[] key(String input){
        String[] strings = input.split(";");
        String[] numbers = strings[1].split(" ");
        int[] nums = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            nums[i] = Integer.parseInt(numbers[i]);
        }
        return nums;
    }

}
