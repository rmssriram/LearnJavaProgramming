package com.intermediate.DataStructures.avlTree;

public class AVLTreeMain {
    public static void main(String args[]){
        AVLTree tree = new AVLTree();
        // Insert values in AVL Tree
        tree.insert(100);
        tree.insert(80);
        tree.insert(200);

        tree.insert(70);
        tree.insert(90);
        tree.insert(150);
        tree.insert(300);
        tree.insert(50);
        tree.insert(250);
        tree.insert(400);
        tree.insert(40);

        System.out.println("After Insertion");
        tree.levelOrderTraversal();

        tree.delete(300);

        System.out.println();
        System.out.println("After Deletion");

        tree.levelOrderTraversal();




    }
}
