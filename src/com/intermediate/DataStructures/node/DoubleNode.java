package com.intermediate.DataStructures.node;

public class DoubleNode {
    private DoubleNode next;
    private DoubleNode prev;
    private int value;

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
