package com.intermediate.DataStructures.trie;

public class TrieMain {
    public static void main(String args[]){
        Trie t = new Trie();
        t.insert("bc");
        t.insert("bcde");
        t.insert("bckg");
        t.insert("astf");
        t.search("as");
        t.search("astf");
        t.search("msk");
        t.delete("bc");
    }
}
