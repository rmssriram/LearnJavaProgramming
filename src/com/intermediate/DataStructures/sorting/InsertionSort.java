package com.intermediate.DataStructures.sorting;

/** Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
 * To implement Insertion Sorting, following steps are involved.
 * Step 1: Starting with the first element(index = 0), compare the current element
 *         with the next element of the array.
 * Step 2: If the current element is greater than the next element of the array, swap them.
 * Step 3: If the current element is less than the next element, move to the next element. Repeat Step 1.
 */

public class InsertionSort{
	public void insertionSort(int arr[]){
		int n=arr.length;
		for(int i=1;i<n;i++){
			int temp=arr[i];
			int j=i;
			while(j>0 && arr[j-1]>temp){
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
	}

	void printArray(int arr[]){
		for (int elm : arr) {
			System.out.println(elm);
		}
	}
}


