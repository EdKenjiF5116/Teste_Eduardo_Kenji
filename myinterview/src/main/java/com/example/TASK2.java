package com.example;

/**
 * Task here is to write a list. Each element must know the element before and
 * after it. Print out your list and them remove the element in the middle of
 * the list. Print out again.
 *
 */

public class TASK2 {

    public static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        System.out.print("Initial list: ");
        printList(head);

        removeMiddleNode(second);

        System.out.print("\nList after removing middle element: ");
        printList(head);
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void removeMiddleNode(Node middleNode) {
        if (middleNode.prev != null && middleNode.next != null) {
            middleNode.prev.next = middleNode.next;
            middleNode.next.prev = middleNode.prev;
        }
    }
}