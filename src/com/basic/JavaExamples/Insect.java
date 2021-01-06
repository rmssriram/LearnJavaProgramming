package com.basic.JavaExamples;

public class Insect {
    int age;
    int numberOfLegs;

    public Insect(int age, int numberOfLegs){
        this.age = age;
        this.numberOfLegs = numberOfLegs;
    }

    public void says(){
        System.out.println("Says...");
    }

    public void crawl(){
        System.out.println("Insect Crawled...");
    }
}
