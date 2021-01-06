package com.basic.JavaExamples;

import java.util.Random;

public class Dice {
    //Random rand;
    public int previousRoll = -1;

    Random rand;


    public Dice(){
        this.rand = new Random();
    }

    public int roll(){
        int currentRoll = this.rand.nextInt(6)+1;
        this.previousRoll = currentRoll;
        return currentRoll;
    }
}
