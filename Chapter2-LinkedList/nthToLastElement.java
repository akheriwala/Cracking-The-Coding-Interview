package com.chapter2;

public class nthToLast {

    static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
        }
    }

    static node nthToLast(node head, int n) {
        if (head == null || n < 0) {
            return null;
        }
        int count = 0;
        node nd = head;
        while (nd != null && count<n) {
            count++;
            nd = nd.next;
        }

        while (nd != null) {
            nd = nd.next;
            head = head.next;
        }

        System.out.println(n +"th element from the end is " +head.data);
        return head;
    }

    public static void main(String[] args) {
        nthToLast.node start = new nthToLast.node(10);
        start.next = new nthToLast.node(20);
        start.next.next = new nthToLast.node(30);
        start.next.next.next = new nthToLast.node(40);
        start.next.next.next.next = new nthToLast.node(50);
        start.next.next.next.next.next = new nthToLast.node(60);
        start.next.next.next.next.next.next = new nthToLast.node(70);
        start.next.next.next.next.next.next.next = new nthToLast.node(80);
        start.next.next.next.next.next.next.next.next = new nthToLast.node(90);

        nthToLast(start, 4);

    }

}
