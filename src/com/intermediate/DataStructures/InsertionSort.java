package com.intermediate.DataStructures;

/** Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
 * To implement Insertion Sorting, following steps are involved.
 * Step 1: Starting with the first element(index = 0), compare the current element
 *         with the next element of the array.
 * Step 2: If the current element is greater than the next element of the array, swap them.
 * Step 3: If the current element is less than the next element, move to the next element. Repeat Step 1.
 */

public class InsertionSort {
    // Function to sort the elements using Bubble Sorting mechanism
    public void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 1; i++) {
           int curr=arr[i];
           int j=i-1;
           while (j>=0 && arr[j]>curr){
               arr[j+1]=arr[j];
               j=j-1;
           }
           arr[j+1]=curr;
        }
    }

    // Function to print the Array
    void printArray(int[] arr) {
        for (int elm : arr) {
            System.out.println(elm);
        }

    }

    public static void main(String args[]) {
        int[] arr = {10, 2, 8, 6, 7, 3};
        InsertionSort obj = new InsertionSort();
        System.out.println("Before Sorting: ");
        obj.printArray(arr);
        obj.insertionSort(arr);
        System.out.println("After Sorting: ");
        obj.printArray(arr);
    }
}