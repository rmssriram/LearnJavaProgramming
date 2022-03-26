package com.intermediate.DataStructures.sorting;

public class QuickSortMain {
    public static void main(String args[]){
        QuickSort qs=new QuickSort();
        int arr[] = {10,4,6,2,1,7,8,1,2,5,9,3};

        System.out.println("Array Entered & Before Sorting: ");
        qs.printArray(arr);

        qs.quickSort(arr, 0, arr.length-1);

        System.out.println("After Sorting: ");
        qs.printArray(arr);
    }
}
