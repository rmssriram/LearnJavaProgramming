package com.intermediate.DataStructures.queue;

import com.intermediate.DataStructures.linkedList.SingeLinkedList;

public class QueueByLinkedList {
    SingeLinkedList list;

    public QueueByLinkedList() {
        list = new SingeLinkedList();
    }

    public void enqueue(int value) {
        if (list.getHead() == null) {
            list.createSingleLinkedList(value);
        } else {
            list.insertInLinkedList(value, list.getSize());
        }
        System.out.println("Successfully Inserted " + value + " to the Queue");
    }

    public void dequeue() {
        if (!isQueueEmpty()) {
            System.out.println("Dequeued Element is " + list.getHead().getValue());
            list.deleteNodeInLinkedList(0);
        }
    }

    public void peekOperation() {
        if (!isQueueEmpty()) {
            System.out.println("Peak Element is " + list.getHead().getValue());
        }
    }

    public boolean isQueueEmpty() {
        if (list.getHead() == null) {
            System.out.println("Queue is Empty!");
            return true;
        } else {
            return false;
        }
    }

    public void deleteQueue() {
        list.setHead(null);
        System.out.println("Queue is deleted!");
    }
}
