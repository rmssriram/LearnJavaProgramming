package com.intermediate.DataStructures.linkedList;

import com.intermediate.DataStructures.node.DoubleNode;

import java.util.function.DoubleToIntFunction;

public class DoubleLinkedList {
    private DoubleNode head;
    private DoubleNode tail;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DoubleNode createDoubleLinkedList(int nodeValue) {
        DoubleNode node = new DoubleNode();
        node.setValue(nodeValue);
        node.setPrev(null);
        node.setNext(null);
        head = tail = node;
        size = 1;
        return head;
    }

    public void traverseList() {
        if (existsLinkedList()) {
            DoubleNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.getValue());
                tempNode = tempNode.getNext();
                if (i != size - 1) {
                    System.out.print("->");
                }
            }
        } else {
            System.out.println("Linked List does not exist!");
        }
        System.out.println("\n");
    }

    public void searchNode(int nodeValue) {
        if (existsLinkedList()) {
            boolean searchValueFound = false;
            DoubleNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.getValue() == nodeValue) {
                    System.out.println("Node Value : " + nodeValue + " found in location : " + (i + 1));
                    searchValueFound = true;
                    break;
                } else {
                    tempNode = tempNode.getNext();
                    searchValueFound = false;
                }
            }
            if (!searchValueFound) {
                System.out.println("Node value : " + nodeValue + " never found in the linked list");
            }
        } else {
            System.out.println("Linked List does not exist!");
        }
    }

    public void reverseTraverseList() {
        if (existsLinkedList()) {
            DoubleNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.getValue());
                tempNode = tempNode.getPrev();
                if (i != size - 1) {
                    System.out.print("<-");
                }
            }
        } else {
            System.out.println("Linked List does not exist!");
        }
        System.out.println("\n");
    }


    void insertInLinkedList(int nodeValue, int location) {
        DoubleNode node = new DoubleNode();
        node.setValue(nodeValue);
        if (!existsLinkedList()) {
            System.out.println("The linked list does not exist!!");
            return; // Linked List does not exists
        } else if (location == 0) {// insert at first position
            node.setNext(head);
            node.setPrev(null);
            head.setPrev(node);
            head = node;
        } else if (location >= size) {// insert at last position
            node.setNext(null);
            tail.setNext(node);
            node.setPrev(tail);
            tail = node; // to keep track of last node
        } else {// insert at specified location
            DoubleNode tempNode = head;
            int index = 0;
            while (index < location - 1) {// loop till we reach specified node
                tempNode = tempNode.getNext();
                index++;
            }
            node.setPrev(tempNode);
            node.setNext(tempNode.getNext());
            tempNode.setNext(node);
            node.getNext().setPrev(node);
        }
        size++;
    }


    public void insertInDoubleLinkedList(int nodeValue, int location) {
        DoubleNode node = new DoubleNode();
        node.setValue(nodeValue);

        if (!existsLinkedList()) {
            System.out.println("The linked list does not exist!!");
            return; // Linked List does not exists
        } else if (location == 0) {// insert at first position
            node.setPrev(null);
            node.setNext(head);
            head.setPrev(node);
            head = node;
        } else if (location >= size) {// insert at last position
            node.setNext(null);
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        } else {// insert at specified location
            DoubleNode tempNode = head;
            int index = 0;
            while (index < location - 1) {// loop till we reach specified node
                tempNode = tempNode.getNext();
                index++;
            }
            node.setPrev(tempNode);
            node.setNext(tempNode.getNext());
            tempNode.setNext(node);
            node.getNext().setPrev(node);
        }
        size++;
    }

    // Deletes a node having a given value
    public void deleteNodeInDoubleLinkedList(int location) {
        if (!existsLinkedList()) {
            System.out.println("The linked list does not exist!!");// Linked List does not exists
            return;
        } else if (location == 0) { // we want to delete first element
            if (getSize() == 1) { // if this is the only node in this list
                head = tail = null;
                setSize(getSize() - 1);
                return;
            } else {
                head = head.getNext();
                head.setPrev(null);
                setSize(getSize() - 1);
            }
        } else if (location >= getSize()-1) { // If location is not in range or equal, then delete last node
            DoubleNode tempNode = tail.getPrev(); // temp node points to 2nd last node
            if (tempNode == head) { // if this is the only element in the list
                tail = head = null;
                setSize(getSize() - 1);
                return;
            }
            tempNode.setNext(null);
            tail = tempNode;
            setSize(getSize() - 1);

        } else { // if any inside node is to be deleted
            DoubleNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.getNext(); // we need to traverse till we find the location
            }
            tempNode.setNext(tempNode.getNext().getNext()); // delete the required node
            tempNode.getNext().setPrev(tempNode);
            setSize(getSize() - 1);
        } // end of else

    }// end of method

    //delete whole linked list
    void deleteDoubleLinkedList() {
        System.out.println("\n\nDeleting Linked List...");
        DoubleNode tempNode = head;
        for (int i = 0; i < size; i++) {
            tempNode.setPrev(null);
            tempNode = tempNode.getNext();
        }

        head = null;
        tail = null;
        System.out.println("Linked List deleted successfully !");
    }


    public boolean existsLinkedList() {
        return head != null;
    }
}
