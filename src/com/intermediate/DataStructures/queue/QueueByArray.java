package com.intermediate.DataStructures.queue;

public class QueueByArray {
    int arr[];
    int beginningOfQueue;
    int topOfQueue;

    public QueueByArray(int size){
        this.arr =new int[size];
        this.beginningOfQueue = -1;
        this.topOfQueue = -1;
        System.out.println("Array Initialized for Creating Queue : " + size);
    }

    public void enqueue(int value) {
         if(!isQueueFull()){
             if(isQueueEmpty()){
                beginningOfQueue=0;
                topOfQueue++;
                arr[topOfQueue] = value;
                System.out.println("Successfully Queued : "+value);
             } else {
                 topOfQueue++;
                 arr[topOfQueue]=value;
                 System.out.println("Successfully Queued : "+value);
             }
         }
        printQueue();
    }

    public void dequeue(int value) {
        if(!isQueueEmpty()){
            System.out.println("Element to be dequeued : " + arr[beginningOfQueue]);
            beginningOfQueue++;
            if(beginningOfQueue>topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            }
        }
        printQueue();
    }

    public void printQueue(){
        if(!isQueueEmpty()){
            for(int i=beginningOfQueue;i<=topOfQueue;i++){
                System.out.println(arr[i]);
            }
        }
    }

    public boolean isQueueFull(){
        if(topOfQueue == arr.length-1){
            System.out.println("Array is full & not space to Enqueue");
            return true;
        } else {
            return false;
        }
    }

    public boolean isQueueEmpty(){
        if((beginningOfQueue == -1)|| (beginningOfQueue == arr.length)){
            System.out.println("Queue is empty!!");
            return true;
        } else {
            return false;
        }
    }

}
