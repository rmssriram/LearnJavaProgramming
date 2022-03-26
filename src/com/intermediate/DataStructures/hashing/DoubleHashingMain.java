package com.intermediate.DataStructures.hashing;
public class DoubleHashingMain {
    public static void main(String args[]){
        DoubleHashing hash = new DoubleHashing(5);
        hash.insertKeyInHashtable("Mani");
        hash.insertKeyInHashtable("Vijay");
        hash.insertKeyInHashtable("Sriram");
        hash.insertKeyInHashtable("Alex");
        hash.displayHashTable();
        hash.searchKeyInHashTable("Vijay");
    }
}
