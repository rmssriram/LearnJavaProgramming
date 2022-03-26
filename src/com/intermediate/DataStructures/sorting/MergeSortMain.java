package com.intermediate.DataStructures.sorting;

public class MergeSortMain {
    public static void main(String args[]){
        int array[]= {10,3,2,5,8,4,3,1,2,9,7,8};
//        int array[] = {10, 36, 56, 2, 87, 1, 0, 234};
        System.out.println("User entered Array: ");
        MergeSort.printArray(array);

        long start = System.nanoTime();
        MergeSort.mergeSort(array, 0, array.length-1);
        long end = System.nanoTime();
        System.out.println("\n\nTime to execute this algo: " + (end-start));

        System.out.println("\nAfter sorting: ");
        MergeSort.printArray(array);
    }
}
