package com.intermediate.DataStructures.heap;

public class HeapByArray {
    int arr[];
    int sizeOfTree;

    public HeapByArray(int size) {
        arr = new int[size + 1];
        sizeOfTree = 0;
        System.out.println("Heap Created Successfully!");

    }

    public int getSizeOfHeap() {
        return arr.length;
    }

    public int getSizeOfTree() {
        return sizeOfTree;
    }

    public boolean isHeapEmpty() {
        if (sizeOfTree <= 0) {
            System.out.println("Heap is Empty!");
            return true;
        } else {
            return false;
        }
    }

    public void deleteHeap() {
        arr = null;
        System.out.println("Deleted the entire Heap!");
    }

    public void insertInHeap(int value) {
        System.out.println("Inserting " + value + " to the Heap");
        arr[sizeOfTree + 1] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree);
        levelOrder();
    }

    public int extractHeadOfHeap() {
        if (sizeOfTree == 0) {
            System.out.println("Heap is empty!");
            return -1;
        } else {
            int extractedValue = arr[1];
            System.out.print("Extracting Head of Heap!");
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            heapifyTopToBottom(1);
            levelOrder();
            System.out.println("New Head of Heap is " + arr[1]);
            return extractedValue;
        }
    }

    public void heapifyTopToBottom(int index) {
        int left = index * 2;
        int right = (index * 2) + 1;
        int smallestChild = 0;
        if (sizeOfTree < left) {
            return;
        } else if (sizeOfTree == left) {
            if (arr[index] > arr[left]) {
                int tmp = arr[index];
                arr[index] = arr[left];
                arr[left] = tmp;
            }
            return;
        } else {
            if (arr[left] < arr[right]) {
                smallestChild = left;
            } else {
                smallestChild = right;
            }
            if (arr[index] > arr[smallestChild]) {
                int tmp = arr[index];
                arr[index] = arr[smallestChild];
                arr[smallestChild] = tmp;
            }
        }
        heapifyTopToBottom(smallestChild);
    }

    public void heapifyBottomToTop(int index) {
        int parent = index / 2;
        if (index <= 1) {
            return;
        } else {
            // Swap Logic
            if (arr[index] < arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }
        heapifyBottomToTop(parent);
    }

    public void levelOrder() {
        System.out.println("Printing all the elements of this Heap...");
        for (int i = 1; i <= sizeOfTree; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}
