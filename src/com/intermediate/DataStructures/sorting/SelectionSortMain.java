package com.intermediate.DataStructures.sorting;

public class SelectionSortMain {

	public static void main(String[] args) {
		System.out.println("Selection Sort");
		SelectionSort ob = new SelectionSort();
		int arr[] = { 10, 5, 30, 15, 50, 6 };
		System.out.println("Array to be sorted...");
		ob.printArray(arr);
		ob.selectionSort(arr);
		System.out.println("Sorted Array...");
		ob.printArray(arr);
	}//end of method

}//end of class