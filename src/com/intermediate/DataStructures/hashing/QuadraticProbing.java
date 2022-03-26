package com.intermediate.DataStructures.hashing;

import java.util.ArrayList;

public class QuadraticProbing {
    String[] hashTable;
    int noOfCellsInHashTable;

    public QuadraticProbing(int size) {
        hashTable = new String[size];
        noOfCellsInHashTable = 0;
    }

    public int simpleASCIIHashFunction(String inpString, int hashTableLength) {
        char ch[];
        ch = inpString.toCharArray();
        int i, sum = 0;
        for (i = 0; i < inpString.length(); i++) {
            sum = sum + ch[i];
        }
        return sum % hashTableLength;
    }

    public void insertKeyInHashtable(String value) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            System.out.println("Time to Rehash as there are short in available memory (within Hash Table)");
            rehashKeys(value);
//            insertKeyInHashtable(value);
        } else {
            System.out.println("Insert Operation Performed Here!");
            int index = simpleASCIIHashFunction(value, hashTable.length);
            int counter = 0;
            for (int i = index; i <  index + hashTable.length; i++) {
                int newIndex = (index + (counter * counter)) % hashTable.length;
                if (hashTable[newIndex] == null) {
                    hashTable[newIndex] = value;
                    System.out.println("Index: " + newIndex + " is blank. Inserting here");
                    break;
                } else {
                    if (newIndex + 1 >= hashTable.length) {
                        rehashKeys(value);
                        break;
                    }
                    else{
                        System.out.println("Index: " + newIndex + " already occupied. Looking for next immediate cell");
                    }
                }
                counter++;
            }
        }
        noOfCellsInHashTable++;
    }

    public void rehashKeys(String newStringToBeInserted) {
        noOfCellsInHashTable = 0;
        ArrayList<String> data = new ArrayList<>();
        for (String s : hashTable) {
            if (s != null) {
                data.add(s);
            }
        }
        data.add(newStringToBeInserted);
        hashTable = new String[hashTable.length * 2];
        for (String s : data) {
            insertKeyInHashtable(s);
        }

    }

    public double getLoadFactor() {
        double loadFactor = noOfCellsInHashTable * 1.0 / hashTable.length;
        return loadFactor;
    }

    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("Hash Table doesn't exists!");
            return;
        } else {
            System.out.println("Printing HashTable...");
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("Index : " + i + " having value :" + hashTable[i]);
            }
        }
    }

    public boolean searchKeyInHashTable(String keyToBeSearched) {
        System.out.println("Search Operation Performed Here!!!");
        int index = simpleASCIIHashFunction(keyToBeSearched, hashTable.length);
        for (int i = index; i < hashTable.length; i++) {
            int newIndex = i % hashTable.length;
            if ((hashTable[newIndex] != null) && (hashTable[newIndex].equals(keyToBeSearched))) {
                System.out.println("Searched Key " + keyToBeSearched + " found in the Hashtable at Index: " + newIndex);
                return true;
            }
        }
        System.out.println("Searched Key " + keyToBeSearched + " not found in the Hashtable");
        return false;
    }

    public void deleteKeyInHashTable(String keyToBeDeleted) {
        System.out.println("Search Operation Performed Here!!!");
        int index = simpleASCIIHashFunction(keyToBeDeleted, hashTable.length);
        for (int i = index; i < hashTable.length; i++) {
            int newIndex = i % hashTable.length;
            if ((hashTable[newIndex] != null) && (hashTable[newIndex].equals(keyToBeDeleted))) {
                hashTable[newIndex]=null;
                System.out.println("Key to be deleted " + keyToBeDeleted + " found in the Hashtable at Index: " + newIndex);
                return;
            }
        }
        System.out.println("Key to be Deleted " + keyToBeDeleted + " not found in the Hashtable");
    }
}