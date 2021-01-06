package com.basic.JavaExamples;

public class Cricket extends Insect {
    double length;
//    boolean isPoisonous;
    public Cricket(int age, double length){
        super(age,6);
        this.length = length;
    }

    public void says(){
        System.out.println("CHIRP...");
    }

    public void jump(){
        System.out.println("Cricket Jumped....");
    }
}
