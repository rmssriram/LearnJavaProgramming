package com.intermediate.DataStructures.sorting;

import com.intermediate.DataStructures.heap.HeapByArray;

public class HeapSort {
    int[] arr=null;

    public HeapSort(int[] arr){
        this.arr=arr;
    }

    public void sort(){
        HeapByArray hba = new HeapByArray(arr.length);
        for(int i=0;i< arr.length;i++){
            hba.insertInHeap(arr[i]);
        }
        for(int i=0;i< arr.length;i++){
            arr[i]=hba.extractHeadOfHeap();
        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

}
