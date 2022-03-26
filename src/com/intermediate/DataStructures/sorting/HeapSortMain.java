package com.intermediate.DataStructures.sorting;

public class HeapSortMain {
    public static void main(String args[]){
        int arr[] = {10,4,6,2,1,7,8,1,2,5,9,3};
        HeapSort hs = new HeapSort(arr);

        System.out.println("Array Entered & Before Sorting: ");
        hs.printArray(arr);

        hs.sort();

        System.out.println("After Sorting: ");
        hs.printArray(arr);
    }
}
