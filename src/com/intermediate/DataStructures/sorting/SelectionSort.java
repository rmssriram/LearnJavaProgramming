/** Selection Sorting - is the bit better algorithm that Bubble Sort
 * that tries to first manipulate the lowest element and possess its index. Finally try to have sorted values from the left.
 *
 * To implement Selection Sorting, following steps are involved.
 * Step 1: Starting with the first element(j = 0) & followed by iteration increment j,
 * start comparing the current element with adjucant element & go all the
 *         way till the end of the array to capture minimum value index.
 * Step 2: If the minimum index is not same as the parent loop index, then swap the element
 * Step 3: Repeat Step 1.
 */

package com.intermediate.DataStructures.sorting;

public class SelectionSort {
    // { 10, 5, 30, 15, 50, 6 }
    void selectionSort(int arr[]) {
        int minimumIndex;
        for (int j = 0; j < arr.length; j++) {
            minimumIndex = j;
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] < arr[minimumIndex]) {
                    minimumIndex = i;
                }
            }
            if (minimumIndex != j) {
                int temp = arr[j];
                arr[j] = arr[minimumIndex];
                arr[minimumIndex] = temp;
            }
        }
    }

    void printArray(int arr[]) {
        for(int elm: arr){
            System.out.println(elm);
        }

    }
}//end of class
