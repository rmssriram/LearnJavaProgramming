package com.intermediate.DataStructures.trie;

import java.util.HashMap;

public class Trie {
    private class TrieNode {
        HashMap<Character, TrieNode> children;
        boolean endOfWord;

        public TrieNode() {
            children = new HashMap<>();
            endOfWord = false;
        }
    }

    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.endOfWord = true;
        System.out.println("Inserted " + word + " to the Trie Successfully!");
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                System.out.println(word + " does not exist in Trie!");
                return false;
            }
            current = node;
        }
        if (current.endOfWord == true) {
            System.out.println(word + " found in Trie Successfully!");
        } else {
            System.out.println(word + " does not in Trie. But, Partial String found which is substring of some other word!");
        }
        return current.endOfWord;
    }

    public void delete(String word) {
        if (search(word) == true) {
            delete(root, word, 0);
        }
    }

    public boolean delete(TrieNode parentNode, String word, int index) {
        boolean canThisNodeBeDeleted;
        char ch = word.charAt(index);
        TrieNode currentNode = parentNode.children.get(ch);

        // CASE#1 -- Some other word's prefix is same as Prefix of this word (BCDE, BCKG)
        // CASE#2 -- We are at last character of this word and This word is a Prefix of some other word (BCDE, BCDEFG)
        // CASE#3 -- Some other word is a Prefix of this word (BCDE, BC)
        // CASE#4 -- No one is dependent on this Word (BCDE, BCDE)
        if ((currentNode.children.size() > 1) && (index != word.length() - 1)) {
            System.out.println("Entering Case #1");
            delete(currentNode, word, index + 1);
            return false;
        }

        if (index == word.length() - 1) {
            if (currentNode.children.size() >= 1) {
                System.out.println("Entering Case #2");
                currentNode.endOfWord = false;
                return false;
            } else {
                System.out.println("Character " + ch + " has no dependency and hence deleting it from the last!");
                parentNode.children.remove(ch);
                return true;
            }
        }

        if (currentNode.endOfWord == true) {
            System.out.println("Entering Case #3");
            delete(currentNode, word, index + 1);
            return false;
        }

        System.out.println("Entering Case #4");
        canThisNodeBeDeleted = delete(currentNode, word, index + 1);
        if (canThisNodeBeDeleted == true) {
            System.out.println("Character " + ch + " has no dependency and hence deleting it from the last!");
            parentNode.children.remove(ch);
            return true;
        } else {
            return false;
        }
    }
}
