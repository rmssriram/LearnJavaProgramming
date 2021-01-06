package com.intermediate.DataStructures;

/** Bubble Sorting - is the simplest algorithm that works
 * repeatedly swapping the adjacent elements if they are in wrong order
 *
 * To implement Bubble Sorting, following steps are involved.
 * Step 1: Starting with the first element(index = 0), compare the current element
 *         with the next element of the array.
 * Step 2: If the current element is greater than the next element of the array, swap them.
 * Step 3: If the current element is less than the next element, move to the next element. Repeat Step 1.
 */

public class BubbleSort {
    // Function to sort the elements using Bubble Sorting mechanism
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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
        BubbleSort obj = new BubbleSort();
        System.out.println("Before Sorting: ");
        obj.printArray(arr);
        obj.bubbleSort(arr);
        System.out.println("After Sorting: ");
        obj.printArray(arr);
    }
}