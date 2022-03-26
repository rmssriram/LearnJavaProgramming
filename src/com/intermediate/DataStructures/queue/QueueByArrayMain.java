package com.intermediate.DataStructures.queue;

public class QueueByArrayMain {
    public static void main(String args[]) {
        QueueByArray queue = new QueueByArray(5);
        for (int i = 0; i < 5; i++) {
            queue.enqueue(i * 10);
        }

        for (int i = 0; i < 5; i++) {
            queue.dequeue(i * 10);
        }

    }
}
