package com.justinfrasier.codeeval.trickOrTreat;

public class Main {

    public String trickOrTreat(String input){

    }

    private int candies(String costumes, int amount){
        int m=0;
        if(costumes.equals("Vampires")) m = 3;
        if(costumes.equals("Zombies")) m = 4;
        if(costumes.equals("Witches")) m =5;
        return amount* m ;
    }

}
