package com.intermediate.DataStructures.linkedList;

public class CircularDoubleLinkedListMain {
    public static void main(String args[]) {
        CircularDoubleLinkedList list = new CircularDoubleLinkedList();
        list.createCircularDoubleLinkedList(10);

        list.insertNodeInCircularDoubleLinkedList(30,2);
        list.traverseList();

        list.insertNodeInCircularDoubleLinkedList(20,1);
        list.insertNodeInCircularDoubleLinkedList(15,1);

        list.traverseList();

        list.searchNode(50);

        list.deletionOfNode(1);

        list.traverseList();

        list.reverseTraverseList();

        list.deleteCircularDoubleLinkedList();





    }
}
