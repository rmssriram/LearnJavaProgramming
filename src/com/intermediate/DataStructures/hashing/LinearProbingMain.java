package com.intermediate.DataStructures.hashing;

public class LinearProbingMain {
    public static void main(String args[]){
        LinearProbing hash =  new LinearProbing(5);
        hash.insertKeyInHashtable("Vijay");
        hash.insertKeyInHashtable("Vijay");
        hash.insertKeyInHashtable("Vijay");
        hash.insertKeyInHashtable("Mani");
        hash.insertKeyInHashtable("Sriram");
        hash.insertKeyInHashtable("Rajiv");

        hash.searchKeyInHashTable("Mani");
        hash.displayHashTable();
        hash.deleteKeyInHashTable("Mani");
        hash.displayHashTable();
        hash.deleteKeyInHashTable("Mani");

    }
}
