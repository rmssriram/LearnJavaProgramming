package com.intermediate.DataStructures.binarySearchTree;

import com.intermediate.DataStructures.node.BinaryNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeByLinkedList {
    BinaryNode root;

    public BinarySearchTreeByLinkedList() {
        root = null;
    }

    public BinaryNode getRoot() {
        return root;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public BinaryNode insert(BinaryNode currentNode, int value) {
        if (currentNode == null) {
            return createBinaryNode(value);
        } else if (value <= currentNode.getValue()) {
            currentNode.setLeft(insert(currentNode.getLeft(), value));
            return currentNode;
        } else {
            currentNode.setRight(insert(currentNode.getRight(), value));
            return currentNode;
        }
    }

    public BinaryNode createBinaryNode(int value) {
        BinaryNode node = new BinaryNode();
        node.setValue(value);
        return node;
    }

    public void levelOrderTraversal() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        if (root == null) {
            System.out.println("Tree does not exist!");
            return;
        }
        while (!queue.isEmpty()) {
            BinaryNode presentNode;
            presentNode = queue.remove();
            System.out.print(presentNode.getValue() + " ");
            if (presentNode.getLeft() != null) {
                queue.add(presentNode.getLeft());
            }
            if (presentNode.getRight() != null) {
                queue.add(presentNode.getRight());
            }
        }
    }

    public void search(int value) {
        searchForValue(root, value);
    }

    public void delete(int value) {
        System.out.println("Deleting value from BST...");
        deleteNodeFromTree(root, value);
    }

    public BinaryNode deleteNodeFromTree(BinaryNode root, int value) {
        if (root == null) {
            System.out.println("The value not found!");
            return null;
        } else if (value < root.getValue()) {
            root.setLeft(deleteNodeFromTree(root.getLeft(), value));
        } else if (value > root.getValue()) {
            root.setRight(deleteNodeFromTree(root.getRight(), value));
        } else {
            if (root.getLeft() != null && root.getRight() != null) {
                BinaryNode temp = root;
                BinaryNode minNodeForRight = minimumElement(temp.getRight());
                root.setValue(minNodeForRight.getValue());
                root.setRight(deleteNodeFromTree(root.getRight(), minNodeForRight.getValue()));
            } else if (root.getLeft() != null) {
                root = root.getLeft();
            } else if (root.getRight() != null) {
                root = root.getRight();
            } else
                root = null;
        }
        return root;
    }

    public static BinaryNode minimumElement(BinaryNode root) {
        if (root.getLeft() == null) {
            return root;
        } else {
            return minimumElement(root.getLeft());
        }
    }

    public BinaryNode searchForValue(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("Node Value not found : " + value);
            return null;
        } else if (node.getValue() == value) {
            System.out.println("Node Value found!!! : " + value);
            return node;
        } else if (value < node.getValue()) {
            return (searchForValue(node.getLeft(), value));
        } else {
            return (searchForValue(node.getRight(), value));
        }
    }

    public void deleteTree() {
        System.out.println();
        root = null;
        System.out.println("Binary Search Tree deleted!!");
    }

}
