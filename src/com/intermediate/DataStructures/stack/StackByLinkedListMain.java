package com.intermediate.DataStructures.stack;

public class StackByLinkedListMain {

    public static void main(String args[]) {
        StackByLinkedList list = new StackByLinkedList();
        for (int i = 0; i < 5; i++) {
            list.push(i*10);
        }

        list.peek();

        for (int i = 0; i < 5; i++) {
            list.pop();
        }

        list.deleteStack();


    }


}
