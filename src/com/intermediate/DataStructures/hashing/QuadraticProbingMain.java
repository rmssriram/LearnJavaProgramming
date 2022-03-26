package com.intermediate.DataStructures.hashing;

public class QuadraticProbingMain {
    public static void main(String args[]){
        QuadraticProbing hash = new QuadraticProbing(3);
        hash.insertKeyInHashtable("Mani");
        hash.insertKeyInHashtable("Mani");
        hash.insertKeyInHashtable("Vijay");

        hash.insertKeyInHashtable("Sriram");
        hash.displayHashTable();
        hash.insertKeyInHashtable("Rajiv");
        hash.deleteKeyInHashTable("Sriram");
        hash.displayHashTable();
        hash.searchKeyInHashTable("Rajiv");
    }
}
