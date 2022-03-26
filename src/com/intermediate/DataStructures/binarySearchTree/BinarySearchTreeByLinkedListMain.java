package com.intermediate.DataStructures.binarySearchTree;

public class BinarySearchTreeByLinkedListMain {
    public static void main(String args[]) {
        BinarySearchTreeByLinkedList tree = new BinarySearchTreeByLinkedList();
        tree.insert(100);
        tree.insert(80);
        tree.insert(70);
        tree.insert(50);
        tree.insert(40);
        tree.insert(60);
        tree.insert(200);
        tree.insert(150);
        tree.insert(300);
        tree.insert(250);
        tree.insert(400);

        tree.levelOrderTraversal();
        System.out.println();
        System.out.println("Searching Node...");
        tree.search(110);

        tree.delete(50);

        tree.levelOrderTraversal();

        tree.deleteTree();



    }
}
