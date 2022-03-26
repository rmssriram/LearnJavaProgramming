package com.intermediate.DataStructures.linkedList;

public class DoubleLinkedListMain {
    public static void main(String args[]){
        DoubleLinkedList list = new DoubleLinkedList();
        list.createDoubleLinkedList(10);
        list.insertInLinkedList(30,1);
        list.insertInLinkedList(20,1);
        list.traverseList();

        list.reverseTraverseList();
        list.searchNode(30);

        list.deleteNodeInDoubleLinkedList(2);

        list.traverseList();
        list.deleteDoubleLinkedList();
    }
}
