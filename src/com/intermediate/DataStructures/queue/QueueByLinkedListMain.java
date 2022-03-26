package com.intermediate.DataStructures.queue;

public class QueueByLinkedListMain {
    public static void main(String args[]) {
        QueueByLinkedList list = new QueueByLinkedList();
        for (int i = 0; i < 5; i++) {
            list.enqueue(i * 10);
        }
        list.dequeue();
        list.dequeue();

        list.peekOperation();
        list.deleteQueue();
    }
}
