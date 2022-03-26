package com.intermediate.DataStructures.linkedList;
import com.intermediate.DataStructures.linkedList.SingeLinkedList;

public class SingleLinkedListMain {
    public static void main(String args[]) {
        SingeLinkedList list = new SingeLinkedList();
        list.createSingleLinkedList(5);

        list.insertInLinkedList(10, 1);
//        list.traverseLinkedList();

        list.insertInLinkedList(20, 2);
//        list.traverseLinkedList();

        list.insertInLinkedList(30, 2);
//        list.traverseLinkedList();

        list.insertInLinkedList(40, 1);
        list.traverseLinkedList();

        list.searchNode(90);

        list.deleteNodeInLinkedList(4);
        list.traverseLinkedList();

        list.deleteNodeInLinkedList(1);
        list.traverseLinkedList();

        list.deleteNodeInLinkedList(9);
        list.traverseLinkedList();

        list.deleteNodeInLinkedList(0);
        list.traverseLinkedList();

        list.deleteSingleLinkedList();

        list.deleteNodeInLinkedList(0);
        list.traverseLinkedList();

    }
}
