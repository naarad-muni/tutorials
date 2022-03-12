package org.arpit.study;

public class RecursionExample {

    public static void main(String[] args) {

        Node v = new Node(4, null, null);
        Node v1 = new Node(60, null, null);
        Node v2 = new Node(20, v, v1);
        Node v4 = new Node(15, null, null);
        Node v5 = new Node(13, null, v4);

        Node root = new Node(10, v2, v5);
        TreeManipulation.printInOrderUsingStack(root);


//        System.out.println(FibonacciCalculator.fibonacci(7));
    }
}
