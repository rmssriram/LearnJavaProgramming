package com.intermediate.DataStructures.sorting;

import java.util.Random;

public class BucketSortMain {
    public static void main(String args[]) {
        int arr[] = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            arr[i] = random.nextInt(20) + 20;
        }

        //Printing Array before Bucket Sorting
        BucketSort bs = new BucketSort(arr);
        System.out.println("\n\nArray before Sorting:");
        bs.printArray();
        bs.bucketSort();

        //Printing Array after Bucket Sorting
        System.out.println("\n\nArray after Sorting:");
        bs.printArray();

    }
}
