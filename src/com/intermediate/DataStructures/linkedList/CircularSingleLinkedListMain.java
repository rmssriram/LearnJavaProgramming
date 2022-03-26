package com.intermediate.DataStructures.linkedList;

public class CircularSingleLinkedListMain {
    public static void main(String args[]) {
        CircularSingleLinkedList list = new CircularSingleLinkedList();
        list.createCircularSingleLinkedList(10);

        list.insertInCircularSingleLinkedList(20,1);
        list.insertInCircularSingleLinkedList(40,2);
        list.insertInCircularSingleLinkedList(30,2);

        list.traverseLinkedList();

        list.searchNode(30);

        list.deleteNodeInCircularLinkedList(4);
        list.deleteNodeInCircularLinkedList(0);
        list.deleteNodeInCircularLinkedList(1);
        list.deleteNodeInCircularLinkedList(0);

        list.deleteCircularSingleLinkedList();
        list.traverseLinkedList();

    }
}
