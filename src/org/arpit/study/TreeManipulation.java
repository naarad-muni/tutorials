package org.arpit.study;

import java.util.Stack;

public class TreeManipulation {

    /**
     * NLR (Node -> Left -> Right)
     * @param root
     */
    public static void printPreOrderTraversal(final Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data);
        printPreOrderTraversal(root.left);
        printPreOrderTraversal(root.right);
    }

    /**
     * LNR (Left -> Node -> Right)
     * @param root
     */
    public static void printInOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        printInOrderTraversal(root.left);
        System.out.println(root.data);
        printInOrderTraversal(root.right);
    }

    public static void printInOrderUsingStack(final Node root) {
        Stack<Node> callStack = new Stack<>();
        Node temp = root;
        Node prevNode = null;

        if (root == null) {
            return;
        } else {
            callStack.push(root);
        }

        while (! callStack.empty()) {
            while (temp.left != null) {
                callStack.push(temp.left);
                temp = temp.left;
            }

            System.out.println(temp.data);

            if (temp.right != null) {
                callStack.push(temp.right);
                temp = temp.right;
            } else {
                prevNode = callStack.pop();

                while ( ! callStack.empty()) {
                    temp = callStack.peek();
                    if (prevNode == temp.left) {
                        System.out.println(temp.data);
                        if (temp.right != null) {
                            callStack.push(temp.right);
                            temp = temp.right;
                            break;
                        } else {
                            prevNode = callStack.pop();
                        }
                    } else if (prevNode == temp.right) {
                        prevNode = callStack.pop();
                    }
                }
            }

        }
    }

}
