package com.intermediate.DataStructures.binaryTree;

import com.intermediate.DataStructures.node.BinaryNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeByLinkedList {
    BinaryNode root;

    public BinaryTreeByLinkedList() {
        this.root = null;
    }

    public void insert(int value) {
        BinaryNode node = new BinaryNode();
        node.setValue(value);
        if (root == null) {
            root = node;
            System.out.println("Binary Tree Successfully Created!");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.getLeft() == null) {
                presentNode.setLeft(node);
                System.out.println("Successfully inserted new node to the Left!");
                break;
            } else if (presentNode.getRight() == null) {
                presentNode.setRight(node);
                System.out.println("Successfully inserted new node to the Right!");
                break;
            } else {
                queue.add(presentNode.getLeft());
                queue.add(presentNode.getRight());
            }
        }
    }

    public void search(int value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if(presentNode.getValue()==value){
                System.out.println("Search value " + value + " found in the Binary Tree!!");
                return;
            }
            else {
                if(presentNode.getLeft()!=null){
                    queue.add(presentNode.getLeft());
                }
                if(presentNode.getRight()!=null){
                    queue.add(presentNode.getRight());
                }
            }
        }
        System.out.println("Search value " + value + " not found in the Binary Tree");
    }

    public void deleteNodeOfBinaryTree(int value){
        Queue<BinaryNode> queue= new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.getValue()==value){
                presentNode.setValue(getDeepestNode().getValue());
//                System.out.println("Before Deletion " + getDeepestNode().getValue());
                deleteDeepestNode();
//                System.out.println("After Deletion " + getDeepestNode().getValue());
                System.out.println("Delete value " + value + " found in the Binary Tree & removed successfully!");
                return;
            } else {
                if(presentNode.getLeft()!=null){
                    queue.add(presentNode.getLeft());
                }
                if(presentNode.getRight()!=null){
                    queue.add(presentNode.getRight());
                }
            }
        }
        System.out.println("Delete value " + value + " not found in the Binary Tree");
    }

    public BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while(!queue.isEmpty()){
            presentNode = queue.remove();
            if(presentNode.getLeft()!=null){
                queue.add(presentNode.getLeft());
            }
            if(presentNode.getRight()!=null){
                queue.add(presentNode.getRight());
            }
        }
        System.out.println("Actual Deepest Node " + presentNode.getValue());
        return presentNode;
    }

    public void deleteDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.getLeft() == null) {
                previousNode.setRight(null);
                return;
            }else if ((presentNode.getRight() == null)) {
                presentNode.setLeft(null);
                return;
            }
            queue.add(presentNode.getLeft());
            queue.add(presentNode.getRight());
        }//end of while loop
    }

    public void preOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }else{
            System.out.print(node.getValue() + " ");
            preOrderTraversal(node.getLeft());
            preOrderTraversal(node.getRight());
        }
    }

    public void postOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }else{
            postOrderTraversal(node.getLeft());
            postOrderTraversal(node.getRight());
            System.out.print(node.getValue() + " ");
        }
    }

    public void inOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }else{
            inOrderTraversal(node.getLeft());
            System.out.print(node.getValue() + " ");
            inOrderTraversal(node.getRight());
        }
    }

    public void levelOrderTraversal(BinaryNode node){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(node);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.getValue() + " ");
            if(presentNode.getLeft()!=null){
                queue.add(presentNode.getLeft());
            }
            if(presentNode.getRight()!=null){
                queue.add(presentNode.getRight());
            }
        }
    }

    public void deleteBinaryTree(){
        root=null;
        System.out.println("Binary Tree Successfully Deleted!!");
    }
}
