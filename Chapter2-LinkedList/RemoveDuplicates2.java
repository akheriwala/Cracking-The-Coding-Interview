package com.chapter2;
//Solution if extra buffer is not allowed.
public class RemoveDups2 {
    static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
        }
    }

    public static void removeDups2 (node head) {
        if (head == null) return;
        node previous = head;
        node current = previous.next;

        while (current != null) {
            node runner = head;
            while (runner != current) {
                if (runner.data == current.data) {
                    node tmp = current.next;
                    previous.next = tmp;
                    current = tmp;
                    break;
                }
                runner = runner.next;
            }
            if (runner == current) {
                previous = current;
                current = current.next;
            }
        }
    }

    //Method to Print LinkedList
    private static void printList(node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        RemoveDups2.node start = new RemoveDups2.node(10);
        start.next = new RemoveDups2.node(12);
        start.next.next = new RemoveDups2.node(13);
        start.next.next.next = new RemoveDups2.node(12);
        start.next.next.next.next = new RemoveDups2.node(15);
        start.next.next.next.next.next = new RemoveDups2.node(16);
        start.next.next.next.next.next.next = new RemoveDups2.node(10);

        System.out.println("LinkedList before removing duplicates: ");
        printList(start);

        removeDups2(start);

        System.out.println("LinkedList after removing duplicates: ");
        printList(start);
    }
}
