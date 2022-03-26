package com.intermediate.DataStructures.avlTree;

import com.intermediate.DataStructures.node.BinaryNode;

import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {
    BinaryNode root;

    public BinaryNode getRoot() {
        return root;
    }

    public void avlTree() {
        root = null;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public void delete(int value) {
        root = deleteNodeFromBST(root, value);
    }

    public BinaryNode deleteNodeFromBST(BinaryNode currentNode, int value) {
        if (currentNode == null) {
            return null;
        }
        if (value < currentNode.getValue()) {
            currentNode.setLeft(deleteNodeFromBST(currentNode.getLeft(), value));
        } else if (value > currentNode.getValue()) {
            currentNode.setRight(deleteNodeFromBST(currentNode.getRight(), value));
        } else {
            if (currentNode.getLeft() != null && currentNode.getRight() != null)  //both left and right sub-tree exists
            {
                BinaryNode temp = currentNode;
                BinaryNode minNodeForRight = minimumElement(temp.getRight());
                currentNode.setValue(minNodeForRight.getValue());
                currentNode.setRight(deleteNodeFromBST(currentNode.getRight(), minNodeForRight.getValue()));

            } else if (currentNode.getLeft() != null) {   // Only Left Sub-tree exists
                currentNode = currentNode.getLeft();
            } else if (currentNode.getRight() != null) {  // Only Right Sub-tree exists
                currentNode = currentNode.getRight();
            } else {
                currentNode = null;
            }
            return currentNode;
        }

        int balance = checkBalance(currentNode.getLeft(), currentNode.getRight());
        if (balance > 1) {  // Left Sub-tree has more nodes that causes imbalance - LL & LR
            if (checkBalance(currentNode.getLeft().getLeft(), currentNode.getLeft().getRight()) > 0) {
                currentNode = rightRotate(currentNode);
            } else {
                currentNode.setLeft(leftRotate(currentNode.getLeft()));
                currentNode = rightRotate(currentNode);
            }
        } else if (balance < -1) {   // Right Sub-tree has more nodes that causes imbalance - RL & RR
            if (checkBalance(currentNode.getRight().getRight(), currentNode.getRight().getLeft()) > 0) {
                currentNode = leftRotate(currentNode);
            } else {
                currentNode.setRight(rightRotate(currentNode.getRight()));
                currentNode = leftRotate(currentNode);
            }
        }

        if (currentNode.getLeft() != null) {
            currentNode.getLeft().setHeight(calculateHeight(currentNode.getLeft()));
        }
        if (currentNode.getRight() != null) {
            currentNode.getRight().setHeight(calculateHeight(currentNode.getRight()));
        }
        currentNode.setHeight(calculateHeight(currentNode));
        return currentNode;

    }

    public BinaryNode minimumElement(BinaryNode root) {
        if (root.getLeft() == null) {
            return root;
        } else {
            return minimumElement(root.getLeft());
        }
    }

    public BinaryNode insert(BinaryNode currentNode, int value) {
        if (currentNode == null) {
            return createNewNode(value);
        } else if (value <= currentNode.getValue()) {
            currentNode.setLeft(insert(currentNode.getLeft(), value));
        } else {
            currentNode.setRight(insert(currentNode.getRight(), value));
        }

        int balance = checkBalance(currentNode.getLeft(), currentNode.getRight());
        if (balance > 1) {  // Left Sub-tree has more nodes that causes imbalance - LL & LR
            if (checkBalance(currentNode.getLeft().getLeft(), currentNode.getLeft().getRight()) > 0) {
                currentNode = rightRotate(currentNode);
            } else {
                currentNode.setLeft(leftRotate(currentNode.getLeft()));
                currentNode = rightRotate(currentNode);
            }
        } else if (balance < -1) {   // Right Sub-tree has more nodes that causes imbalance - RL & RR
            if (checkBalance(currentNode.getRight().getRight(), currentNode.getRight().getLeft()) > 0) {
                currentNode = leftRotate(currentNode);
            } else {
                currentNode.setRight(rightRotate(currentNode.getRight()));
                currentNode = leftRotate(currentNode);
            }
        }

        if (currentNode.getLeft() != null) {
            currentNode.getLeft().setHeight(calculateHeight(currentNode.getLeft()));
        }
        if (currentNode.getRight() != null) {
            currentNode.getRight().setHeight(calculateHeight(currentNode.getRight()));
        }
        currentNode.setHeight(calculateHeight(currentNode));
        return currentNode;
    }

    public BinaryNode rightRotate(BinaryNode currentNode) {
        BinaryNode newRoot = currentNode.getLeft();
        currentNode.setLeft(currentNode.getLeft().getRight());
        newRoot.setRight(currentNode);
        currentNode.setHeight(calculateHeight(currentNode));
        newRoot.setHeight(calculateHeight(newRoot));
        return newRoot;
    }

    public BinaryNode leftRotate(BinaryNode currentNode) {
        BinaryNode newRoot = currentNode.getRight();
        currentNode.setRight(currentNode.getRight().getLeft());
        newRoot.setLeft(currentNode);
        currentNode.setHeight(calculateHeight(currentNode));
        newRoot.setHeight(calculateHeight(newRoot));
        return newRoot;
    }

    public int calculateHeight(BinaryNode currentNode) {
        if (currentNode == null) {
            return 0;
        }
        return 1 + Math.max((currentNode.getLeft() != null ? currentNode.getLeft().getHeight() : -1),
                (currentNode.getRight() != null ? currentNode.getRight().getHeight() : -1));
    }

    public int checkBalance(BinaryNode rootLeft, BinaryNode rootRight) {
        if (rootLeft == null && rootRight == null) {
            return 0;
        } else if (rootLeft == null) {
            return -1 * (rootRight.getHeight() + 1);
        } else if (rootRight == null) {
            return rootLeft.getHeight() + 1;
        } else {
            return rootLeft.getHeight() - rootRight.getHeight();
        }
    }

    public BinaryNode createNewNode(int value) {
        BinaryNode node = new BinaryNode();
        node.setValue(value);
        node.setHeight(0);
        return node;
    }

    public void levelOrderTraversal() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        if (root == null) {
            System.out.println("Tree does not exist!");
            return;
        }
        while (!queue.isEmpty()) {
            BinaryNode presentNode;
            presentNode = queue.remove();
            System.out.print(presentNode.getValue() + " ");
            if (presentNode.getLeft() != null) {
                queue.add(presentNode.getLeft());
            }
            if (presentNode.getRight() != null) {
                queue.add(presentNode.getRight());
            }
        }
    }


}
