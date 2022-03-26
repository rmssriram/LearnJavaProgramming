package com.intermediate.DataStructures.stack;

import com.intermediate.DataStructures.linkedList.SingeLinkedList;

public class StackByLinkedList {
    SingeLinkedList list;

    public StackByLinkedList() {
        list = new SingeLinkedList();
    }

    public void push(int value) {
        if (list.getHead() == null) {
            list.createSingleLinkedList(value);
        } else {
            list.insertInLinkedList(value, 0);
        }
        System.out.println("Inserted " + value + " in the Stack");
    }

    public void peek() {
        if (!isStackEmpty()) {
            System.out.println("The Peek value is " + list.getHead().getValue());
        }
    }

    public void pop() {
        if (!isStackEmpty()) {
            System.out.println("Element " + list.getHead().getValue() + " removed from Stack");
            list.deleteNodeInLinkedList(0);
        }

    }

    public void deleteStack() {
        list.setHead(null);
    }

    public boolean isStackEmpty() {
        if (list.getHead() == null) {
            System.out.println("Stack is empty");
            return true;
        } else {
            return false;
        }
    }


}
