package com.intermediate.DataStructures.linkedList;

import com.intermediate.DataStructures.node.DoubleNode;

public class CircularDoubleLinkedList {
    private DoubleNode head;
    private DoubleNode tail;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DoubleNode createCircularDoubleLinkedList(int nodeValue) {
        DoubleNode node = new DoubleNode();
        node.setValue(nodeValue);
        node.setPrev(node);
        node.setNext(node);
        head = tail = node;
        size = 1;
        return head;
    }

    public void traverseList() {
        DoubleNode tempNode = head;
        if (existsLinkedList()) {
            for (int i = 0; i < getSize(); i++) {
                System.out.print(tempNode.getValue());
                tempNode=tempNode.getNext();
                if (i != getSize() - 1) {
                    System.out.print("->");
                }
            }
        } else {
            System.out.print("Linked List does not exist!");
        }
        System.out.println("\n");
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

    //delete whole linked list
    void deleteCircularDoubleLinkedList() {
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



    public void insertNodeInCircularDoubleLinkedList(int nodeValue, int location) {
        DoubleNode node = new DoubleNode();
        node.setValue(nodeValue);
        if (!existsLinkedList()) {
            System.out.println("Linked List does not exist!");
            return;
        } else if (location == 0) {
            node.setPrev(tail);
            node.setNext(head);
            head.setPrev(node);
            tail.setNext(node);
            head = node;
        } else if (location >= getSize()) {
            node.setPrev(tail);
            node.setNext(head);
            head.setPrev(node);
            tail.setNext(node);
            tail = node;
        } else {
            DoubleNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.getNext();
            }
            node.setPrev(tempNode);
            node.setNext(tempNode.getNext());
            tempNode.setNext(node);
            node.getNext().setPrev(node);
        }
        size++;
    }

    public boolean searchNode(int nodeValue) {
        DoubleNode tempNode = head;
        boolean isSearchFound = false;
        if (existsLinkedList()) {
            for (int i = 0; i < getSize(); i++) {
                if (tempNode.getValue() == nodeValue) {
                    System.out.print("Node value : " + nodeValue + " found in location : " + (i + 1));
                    return true;
                }
                tempNode = tempNode.getNext();
            }
        } else {
            System.out.print("Linked List does not exist!");
            return false;
        }
        System.out.println("Searched Node not found!! ");
        return false;
    }

    public void deletionOfNode(int location) {
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
                head.setPrev(tail);
                setSize(getSize() - 1);
            }
        } else if (location >= getSize()-1) { // If location is not in range or equal, then delete last node
            DoubleNode tempNode = tail.getPrev(); // temp node points to 2nd last node
            if (tempNode == head) { // if this is the only element in the list
                tail = head = null;
                setSize(getSize() - 1);
                return;
            }
            tempNode.setNext(head);
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


    public boolean existsLinkedList() {
        return head != null;
    }

}
