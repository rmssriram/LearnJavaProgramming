package com.basic.JavaExamples;

public class DishTransition {
    public static void main(String args[]){
        System.out.println("**************************************************");
        System.out.println("Create Object for Vaithee to access Potato Fry");
        PotatoDishes vaitheePFObj = new PotatoDishes(5, 20,100, 1, 10, 5, 0, 1, 0,0,0);
        vaitheePFObj.potatoFryRecipe();
        System.out.println("**************************************************");

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("**************************************************");
        System.out.println("Create Object for Sivaranjini to access both Potato Fry & Potato Masala");
        PotatoDishes sivaPFObj = new PotatoDishes(3, 15, 75, 1, 10, 5, 15, 1, 1, 2, 2);
        sivaPFObj.potatoFryRecipe();
        sivaPFObj.potatoMasalaRecipe();
        System.out.println("**************************************************");
    }
}
