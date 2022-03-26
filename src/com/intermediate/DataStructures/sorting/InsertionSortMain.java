package com.intermediate.DataStructures.sorting;

public class InsertionSortMain {
	public static void main(String[] args) {
		
		int array[] = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};
		InsertionSort obj = new InsertionSort();

		System.out.println("User entered Array: ");
		obj.printArray(array);
		
		long start = System.nanoTime();
		obj.insertionSort(array);
		long end = System.nanoTime();
		System.out.println("\n\nTime to execute this algo: " + (end-start));
		
		System.out.println("\nAfter sorting: ");
		obj.printArray(array);
	}//end of method
	
}//end of class
