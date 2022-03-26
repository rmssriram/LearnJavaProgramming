package com.intermediate.DataStructures.binaryTree;

public class BinaryTreeByArray {
    int[] arr;
    int lastUsedIndex;

    public BinaryTreeByArray(int size) {
        this.arr = new int[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Binary Tree! created for the Array Size " + size);
    }

    public boolean isTreeFull() {
        if (arr.length - 1 == lastUsedIndex) {
            return true;
        } else {
            return false;
        }
    }

    public void insert(int value) {
        if (!isTreeFull()) {
            arr[lastUsedIndex + 1] = value;
            lastUsedIndex++;
            System.out.println("Value inserted in the Binary Tree " + value);
        } else {
            System.out.print("Unable to insert value to the Tree as its full");
        }
    }

    public int search(int value) {
        for (int i = 1; i <= lastUsedIndex; i++) {
            if (arr[i] == value) {
                System.out.print("The value " + value + " found in the Tree at location " + i);
                return i;
            }
        }
        System.out.print("The value " + value + " not found in the Tree");
        return -1;
    }

    public void delete(int value) {
        int location = search(value);
        if (location != -1) {
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("Value found" + value + " & deleted from the tree successfully");
        }
    }

    public void levelOrderTraversal() {
        System.out.println("Level Order Traversal:");
        for (int i = 1; i <= lastUsedIndex; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    public void inOrderTraversal(int index) {
        if (index > lastUsedIndex) {
            return;
        } else {
            inOrderTraversal(index * 2);
            System.out.print(arr[index] + " ");
            inOrderTraversal(index * 2 + 1);
        }
    }

    public void preOrderTraversal(int index) {
        if (index > lastUsedIndex) {
            return;
        } else {
            System.out.print(arr[index] + " ");
            preOrderTraversal(index * 2);
            preOrderTraversal(index * 2 + 1);
        }
    }

    public void postOrderTraversal(int index) {
        if (index > lastUsedIndex) {
            return;
        } else {
            postOrderTraversal(index * 2);
            postOrderTraversal(index * 2 + 1);
            System.out.print(arr[index] + " ");
        }
    }

    public void deleteTree() {
        arr = null;
        System.out.println("Binary Tree Deleted Successfully");
    }


}
