package com.intermediate.DataStructures.linkedList;

import com.intermediate.DataStructures.node.SingleNode;

public class SingeLinkedList {
    private SingleNode head;
    private SingleNode tail;
    private int size;

    public SingleNode getHead() {
        return head;
    }

    public void setHead(SingleNode head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public SingleNode createSingleLinkedList(int nodeValue) {
        SingleNode node = new SingleNode();
        node.setValue(nodeValue);
        node.setNext(null);
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInLinkedList(int nodeValue, int location) {
        SingleNode node = new SingleNode();
        node.setValue(nodeValue);

        if (!isExistLinkedList()) {
            System.out.print("Linked List does not exist!");
        } else if (location == 0) {
            node.setNext(head);
            head = node;
        } else if (location >= size) {
            node.setNext(null);
            tail.setNext(node);
            tail = node;
        } else {
            SingleNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.getNext();
                index++;
            }
            node.setNext(tempNode.getNext());
            tempNode.setNext(node);
        }
        setSize(getSize() + 1);
    }

    public void deleteNodeInLinkedList(int location) {
        if (!isExistLinkedList()) {
            System.out.println("Linked List does not exist!");
        } else if (location == 0) {
            head = head.getNext();
            setSize(getSize() - 1);
            if (getSize() == 0) { // if there are no more nodes in this list
                tail = null;
            }
        } else if (location >= getSize()) {
            SingleNode tempNode = head;
            int index = 0;
            while (index < getSize() - 1) {
                tempNode = tempNode.getNext();
                index++;
            }
            if (tempNode == head) { //if this is the only element in the list
                tail = head = null;
                setSize(getSize()-1);
                return;
            }
            tempNode.setNext(null);
            tail= tempNode;
            setSize(getSize()-1);
        } else {
            SingleNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.getNext();
                index++;
            }
            tempNode.setNext(tempNode.getNext().getNext());
            setSize(getSize()-1);
        }
    }

    public void deleteSingleLinkedList(){
        head = tail = null;
    }

    public boolean isExistLinkedList() {
        return head != null;
    }

    public void traverseLinkedList() {
        if (isExistLinkedList()) {
            SingleNode tempNode = head;
            for (int i = 0; i < getSize(); i++) {
                System.out.print(tempNode.getValue());
                if (i < getSize() - 1)
                    System.out.print("->");
                tempNode = tempNode.getNext();
            }
        } else {
            System.out.println("Linked List does not exist!");
        }
    }

    public void searchNode(int nodeValue) {
        boolean resultFound = false;
        if (isExistLinkedList()) {
            SingleNode tempNode = head;
            for (int i = 0; i < getSize(); i++) {
                if (tempNode.getValue() == nodeValue) {
                    System.out.println("Node Found : " + nodeValue + " in location " + (i + 1));
                    resultFound = true;
                    break;
                } else {
                    resultFound = false;
                }
                tempNode = tempNode.getNext();
            }
        } else {
            System.out.print("Linked List does not exist!");
        }
        if (!resultFound) {
            System.out.println("Node Value not Found : " + nodeValue);

        }
    }
}
