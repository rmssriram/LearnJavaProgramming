package com.intermediate.DataStructures.stack;

public class StackByArrayMain {
    public static void main(String args[]) {
        StackByArray list = new StackByArray(5);
        for (int i = 0; i <= 5; i++) {
            list.push(i);
        }
        // Printing peek value
        list.peek();

        for (int i = 0; i <= 5; i++) {
            list.pop();
        }

        list.deleteStack();

    }


}
