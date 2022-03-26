package com.intermediate.DataStructures.hashing;

import java.util.LinkedList;

public class DirectChaining {
    LinkedList<String>[] hashtable;

    public DirectChaining(int size) {
        hashtable = new LinkedList[size];
    }

    public void insertKeyInHashTable(String value) {
        int newIndex = simpleASCIIHashFunction(value, hashtable.length);
        System.out.println("Insert Operation Performed Here!!!");
        if (hashtable[newIndex] != null) {
            System.out.println("Index " + newIndex + " is not empty! So just adding value to existing Linked List (assume there is one that went through else condition)...");
            hashtable[newIndex].add(value);
        } else {
            System.out.println("Index " + newIndex + " is empty! Creating a new Linked List here...");
            hashtable[newIndex] = new LinkedList<String>();
            hashtable[newIndex].add(value);
        }
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

    public void displayHashTable() {
        if (hashtable == null) {
            System.out.println("Hash Table doesn't exists!");
            return;
        } else {
            System.out.println("Printing HashTable...");
            for (int i = 0; i < hashtable.length; i++) {
                System.out.println("Index : " + i + " having value :" + hashtable[i]);
            }
        }
    }

    public boolean searchKeyInHashTable(String keyToBeSearched) {
        int newIndex = simpleASCIIHashFunction(keyToBeSearched, hashtable.length);
        System.out.println("Search Operation Performed Here!!!");
        if ((hashtable[newIndex] != null) && (hashtable[newIndex].contains(keyToBeSearched))) {
            System.out.println("Searched Key " + keyToBeSearched + " found in the Hashtable at Index: " + newIndex);
            return true;
        } else {
            System.out.println("Searched Key " + keyToBeSearched + " not found in the Hashtable");
            return false;
        }
    }

    public void deleteKeyInHashTable(String keyToBeDeleted) {
        int newIndex = simpleASCIIHashFunction(keyToBeDeleted, hashtable.length);
        System.out.println("Delete Operation Performed Here!!!");
        if ((hashtable[newIndex] != null) && (hashtable[newIndex].contains(keyToBeDeleted))) {
            System.out.println("Key to be deleted " + keyToBeDeleted + " found in the Hashtable at Index: " + newIndex);
            hashtable[newIndex].remove(keyToBeDeleted);
        } else {
            System.out.println("Key to be deleted " + keyToBeDeleted + " not found in the Hashtable");
        }
    }
}
