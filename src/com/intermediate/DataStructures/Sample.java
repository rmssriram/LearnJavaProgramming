package com.intermediate.DataStructures;
import java.lang.String;
class Sample {
    static int count = 0;
    public static void main(String[] args) {
        if(count < 3){
            count++;
            main(null);
        }else{
            return;
        }
        System.out.println("Hello World!");
    }
}