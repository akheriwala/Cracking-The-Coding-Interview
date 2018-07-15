/**
 * Implement an algorithm to find the nth to last element of a singly linked list.
 * Solution -
 * 1. Find the nth element from the start of the LinkedList.
 * 2. Head of the LinkedList is at index 0.
 * 3. Move both the nth element & the head until the nth element reaches the end of the LinkedList or null.
 * 4. The moved head of the Linkedlist is now the nth to the last element of the singly linked list.
 */

package com.chapter2;
import helper.node;

public class nthToLast {


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

    //Test class
    public static void main(String[] args) {

          int[] list = {10, 20, 30, 40, 50, 60, 70, 80, 90};
          node n = node.buildList(list);

        nthToLast(n, 4);

    }

}
