package com.intermediate.DataStructures.stack;

public class StackByArray {
    int[] arr;
    int topOfStack;

    public StackByArray(int size) {
        this.arr = new int[size];
        topOfStack = -1;
        System.out.println("Successfully created an empty Stack of Size: " + size);
    }

    public void push(int value) {
        if (isStackFull()) {
            System.out.println("Can't insert elements to the Stack!!");
            return;
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("Successfully inserted " + value + " in the stack");
        }
    }

    public void pop(){
        if (!isStackEmpty()) {
            System.out.println("Poping value from Stack: " + arr[topOfStack] + "...");
            topOfStack--;
        }
    }

    public void deleteStack(){
        arr = null;
        System.out.println("Stack deleted!");
    }

    public void peek() {
        if (!isStackEmpty()) {
            System.out.println("Peek value is " + arr[topOfStack]);
        }
    }

    public boolean isStackEmpty() {
        if (topOfStack == -1) {
            System.out.println("Stack is empty!");
            return true;
        } else {
            return false;
        }
    }

    public boolean isStackFull() {
        if (topOfStack == arr.length - 1) {
            System.out.println("Array is full!");
            return true;
        } else {
            return false;
        }
    }


}
