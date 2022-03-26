package com.intermediate.DataStructures.binaryTree;

public class BinaryTreeByArrayMain {
    public static void main(String args[]){
        BinaryTreeByArray tree = new BinaryTreeByArray(10);
        for(int i=1;i<=10;i++){
            tree.insert(i*10);
        }

        tree.search(50);

        tree.delete(50);

        tree.levelOrderTraversal();

        System.out.println("In Order Traversal:");
        tree.inOrderTraversal(1);

        System.out.println();

        System.out.println("Post Order Traversal:");
        tree.postOrderTraversal(1);

        System.out.println();

        System.out.println("Pre Order Traversal:");
        tree.preOrderTraversal(1);

        System.out.println();
        tree.deleteTree();
        tree.deleteTree();

    }
}
