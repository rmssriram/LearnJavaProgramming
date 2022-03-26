package com.intermediate.DataStructures.binaryTree;

public class BinaryTreeByLinkedListMain {
    public static void main(String args[]){
        BinaryTreeByLinkedList list = new BinaryTreeByLinkedList();
        for(int i=1;i<=7;i++){
            list.insert(i*10);
        }
        list.search(50);
        list.search(11);
        list.deleteNodeOfBinaryTree(60);

        System.out.println("Level-Order Traversal");
        list.levelOrderTraversal(list.root);
        System.out.println("\n");

        System.out.println("Level-Order Traversal");
        list.levelOrderTraversal(list.root);
        System.out.println("\n");

        System.out.println("In-Order Traversal");
        list.inOrderTraversal(list.root);
        System.out.println("\n");

        System.out.println("Post-Order Traversal");
        list.postOrderTraversal(list.root);
        System.out.println("\n");

        list.deleteBinaryTree();
    }
}
