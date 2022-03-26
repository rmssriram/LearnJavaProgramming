package com.intermediate.DataStructures.hashing;

public class DirectChainingMain {
    public static void main(String args[]){
        DirectChaining hash = new DirectChaining(2);

        hash.insertKeyInHashTable("Vijay");
        hash.insertKeyInHashTable("Vijay");
        hash.insertKeyInHashTable("Mani");
        hash.insertKeyInHashTable("Sriram");
        hash.insertKeyInHashTable("Rajiv");
        hash.insertKeyInHashTable("Yajiv");
        System.out.println();
        hash.displayHashTable();
        hash.searchKeyInHashTable("Vijay");
        hash.searchKeyInHashTable("Mohan");
        hash.deleteKeyInHashTable("Vijay");
        hash.displayHashTable();
    }
}
