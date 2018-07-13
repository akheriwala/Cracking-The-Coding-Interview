package com.chapter2;

import java.util.*;

public class RemoveDups {

    //Define the node class
    static class node {
        int data;
        node next; //recursion

        public node(int data) {
            this.data = data;
        }
    }

    //Method to remove duplicates from LinkedList
    public static void deleteDups(node n) {
        HashSet<Integer> set = new HashSet<>();
        node previous = null;
        while (n != null) {
            if(set.contains(n.data)) {
                previous.next = n.next;
            } else {
                set.add(n.data);
                previous = n;
            }
            n = n.next;
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
        node start = new node(10);
        start.next = new node(12);
        start.next.next = new node(13);
        start.next.next.next = new node(12);
        start.next.next.next.next = new node(15);
        start.next.next.next.next.next = new node(16);
        start.next.next.next.next.next.next = new node(10);

        System.out.println("LinkedList before removing duplicates: ");
        printList(start);

        deleteDups(start);

        System.out.println("LinkedList after removing duplicates: ");
        printList(start);


    }

}
