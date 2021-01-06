package com.basic.JavaExamples;

public class PotatoDishes
{

    // Variables declared for cooking any Potato Dishes listed below (Potato Fry, Potato Masala)
    int potatoInCount;
    int mustardSeedsInGms;
    int oilInML;
    int saltInTSP;
    int turmericPowderInGms;
    int curryLeavesInCount;
    int corianderLeavesInGms;
    int chillyPowderInTSP;
    int onionsInCount;
    int tomatoesInCount;
    int greenChillisInCount;


    // Defined a constructor for this class to accept necessary input parameters
    // Constructor is a method whose name should be same as of its Class Name
    // Usually Constructor will not return anything so there is no return type mentioned here below
    // Constructor can accept inputs & process assignment operations to the variables - In this case,
    // PotatoDishes constructor method would accept all the input values for assigning those to the class blueprint variables
    public PotatoDishes(int inpPotatoInCount, int inpMustardSeedsInGms, int inpOilInML, int inpSaltInTSP,
                        int inpTurmericPowderInGms, int inpCurryLeavesInCount, int inpCorianderLeavesInGms,
                        int inpChillyPowderInTSP, int inpOnionsInCount, int inpTomatoesInCount,
                        int inpGreenChillisInCount)
    {
        // this refers to the current object which is invoked by using this class
        this.potatoInCount = inpPotatoInCount;
        this.mustardSeedsInGms = inpMustardSeedsInGms;
        this.oilInML = inpOilInML;
        this.saltInTSP = inpSaltInTSP;
        this.turmericPowderInGms = inpTurmericPowderInGms;
        this.curryLeavesInCount = inpCurryLeavesInCount;
        this.corianderLeavesInGms = inpCorianderLeavesInGms;
        this.chillyPowderInTSP = inpChillyPowderInTSP;
        this.onionsInCount = inpOnionsInCount;
        this.tomatoesInCount = inpTomatoesInCount;
        this.greenChillisInCount = inpGreenChillisInCount;
    }

    public void potatoFryRecipe()
    {
        System.out.println("Method of Preparing Potato Fry:");
        System.out.println("Step 1: Add " + this.oilInML + " ml of Oil in a pan & allow it to heat.");
        System.out.println("Step 2: Add " + this.mustardSeedsInGms + " of Mustard Seeds & allow it to splutter");
        System.out.println("Step 3: Add " + this.curryLeavesInCount + " Curry Leaves");
        System.out.println("Step 4: Add " + this.potatoInCount + " chopped pieces of Potato and Fry it along");
        System.out.println("Step 5: Add 1 TeaSpoons of " + this.turmericPowderInGms + "  of Turmeric Powder " +
                "and Fry the vegetable further for 3 mins");
        System.out.println("Step 6: Add 1 TeaSpoons of " + this.chillyPowderInTSP + " of Chill Powder");
        System.out.println("Step 7: Add 1 TeaSpoons of " + this.saltInTSP + " Salt");
    }

    public void potatoMasalaRecipe()
    {
        System.out.println("Method of Preparing Potato Masala:");
        System.out.println("Step 1: Add " + this.oilInML + " ml of Oil in a pan & allow it to heat.");
        System.out.println("Step 2: Add " + this.mustardSeedsInGms + " of Mustard Seeds & allow it to splutter");
        System.out.println("Step 4: Add " + this.onionsInCount + " chopped pieces of Onions");
        System.out.println("Step 4: Add " + this.tomatoesInCount + " chopped pieces of Tomatoes");
        System.out.println("Step 5: Add " + this.greenChillisInCount + " chopped pieces of Green Chilly");
        System.out.println("Step 6: Add 1 TeaSpoons of " + this.turmericPowderInGms + " of Turmeric Powder");
        System.out.println("Step 7: Add " + this.curryLeavesInCount + " Curry Leaves");
        System.out.println("Step 8: Add " + this.potatoInCount + " boiled Potatoes and mash along with the masala");
        System.out.println("Step 9: Add 1 TeaSpoons of " + this.chillyPowderInTSP + " of Chill Powder");
        System.out.println("Step 10: Add 1 TeaSpoons of " + this.saltInTSP + " Salt");
        System.out.println("Step 11: Add " + this.corianderLeavesInGms + " grams of Coriander Leaves and saute it");
    }
}
