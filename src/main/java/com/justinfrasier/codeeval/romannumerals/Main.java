package com.justinfrasier.codeeval.romannumerals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args)throws IOException{
        File file = new File(args[0]);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while((line = bufferedReader.readLine()) !=null){
            System.out.println(roman(line.trim()));
        }
    }


    public static String roman(String input) {
        int inputNumber = Integer.parseInt(input);
        String romanNumber="";
        while(inputNumber > 0) {
            if(inputNumber >= 1000) {
                romanNumber += "M";
                inputNumber -=1000;
            }
            else if(inputNumber >= 900){
                romanNumber += "CM";
                inputNumber -= 900;
            }
            else if(inputNumber >= 500){
                romanNumber+="D";
                inputNumber-=500;
            }
            else if(inputNumber >= 400){
                romanNumber += "CD";
                inputNumber-=400;
            }
            else if(inputNumber >= 100){
                romanNumber +="C";
                inputNumber -= 100;
            }
            else if(inputNumber >= 90){
                romanNumber += "XC";
                inputNumber -= 90;
            }
            else if(inputNumber >= 50){
                romanNumber+= "L";
                inputNumber-=50;
            }
            else if(inputNumber>=40){
                romanNumber += "XL";
            }
            else if(inputNumber >= 10){
                romanNumber+="X";
                inputNumber-=10;
            }
            else if(inputNumber == 9){
                romanNumber += "IX";
                inputNumber -= 9;
            }
            else if(inputNumber >= 5){
                romanNumber+= "V";
                inputNumber -= 5;
            }
            else if(inputNumber==4){
                romanNumber += "IV";
                inputNumber-=4;
            }
            else if(inputNumber >= 1){
                romanNumber += "I";
                inputNumber -= 1;
            }

        }
        return romanNumber;
    }
}
