package com.intermediate.DataStructures.queue;

public class CircularQueueByArrayMain {
    public static void main(String args[]) {
        CircularQueueByArray queue = new CircularQueueByArray(5);

        for (int i = 0; i < 5; i++) {
            queue.enqueue(i * 10);
        }
        queue.dequeue();
        queue.dequeue();
        queue.peekOperation();
        queue.deleteQueue();
    }
}
