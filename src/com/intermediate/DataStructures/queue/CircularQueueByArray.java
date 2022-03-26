package com.intermediate.DataStructures.queue;

public class CircularQueueByArray {
    int arr[];
    int topOfQueue;
    int beginningOfQueue;
    int size;

    public CircularQueueByArray(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        this.size = size;
    }

    public void enqueue(int value) {
        if (arr == null) {
            System.out.print("Array doesn't exist! Create one to enqueue elements");
        } else if (isQueueFull()) {
            System.out.println("Queue overflow error!!");
        } else {
            initializeStartOfArray();
            if (topOfQueue + 1 == size) {
                topOfQueue = 0;
            } else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;
        }
        System.out.println(arr[topOfQueue] + " is added to the queue");
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Queue underflow Error!");
        } else {
            System.out.println("Dequeueing Elements!!!");
            arr[beginningOfQueue] = 0;
            if (beginningOfQueue == topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            } else if (beginningOfQueue + 1 == size) {
                beginningOfQueue = 0;
            } else {
                beginningOfQueue++;
            }
        }
        printArray();
    }

    public void printArray() {
        System.out.println("Array now...");
        for(int i=0; i<size; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println("\nStart = " + beginningOfQueue);
        System.out.println("End = "+ topOfQueue);
    }//end of method


    public boolean isQueueEmpty() {
        if (topOfQueue == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void initializeStartOfArray() {
        if (beginningOfQueue == -1) {
            beginningOfQueue = 0;
        }
    }

    public boolean isQueueFull() {
        if (topOfQueue + 1 == beginningOfQueue) {
            return true;
        } else {
            return false;
        }
    }

    public void peekOperation() {
        //if stack is not empty, return the value on top of stack
        if (!isQueueEmpty()) {
            System.out.println("\nPeeking value from queue...");
            System.out.println(arr[beginningOfQueue]);
        }else {
            System.out.println("The queue is empty!!");
        }
    }//end of method


    public void deleteQueue() {
        System.out.println("\n\nDeleting the entire Queue...");
        arr = null;
        System.out.println("Queue is successfully deleted !");
    }//end of method


}
