package org.arpit.study;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int value, Node leftNode, Node rightNode) {
        data = value;
        left = leftNode;
        right = rightNode;
    }
}
