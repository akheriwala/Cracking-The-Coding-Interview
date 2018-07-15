/**
 * Implement an algorithm to delete a node in the middle of a singly linked list,
 * given only access to that node.
 */

package com.chapter2;
import helper.node;

public class DeleteMiddleNode {

    static boolean deleteMiddleNode(node n) {
        //Fail if node is the last element
        if (n == null || n.next == null) return false;
        node next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }

    //TEST
    public static void main(String[] args) {
        int[] list = {3,2,1,0};
        node head = node.buildList(list);
        node n1 = head.next;
        node n2 = head.next.next;
        node n3 = head.next.next.next;

        System.out.println("DELETE " +n1 + ": " +deleteMiddleNode(n1));
        node.printList(n1);

        System.out.println("DELETE " +n2 + ": " +deleteMiddleNode(n2));
        node.printList(n2);

        System.out.println("DELETE " +n3 + ": " +deleteMiddleNode(n3));
        node.printList(n3);




    }
}
