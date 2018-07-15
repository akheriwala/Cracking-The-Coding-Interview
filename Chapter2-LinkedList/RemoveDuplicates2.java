/**
 * Write code to remove duplicates from an unsorted linked list.
 *
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 *
 * Below solution is implemented when a temporary buffer is not allowed.
 */

package com.chapter2;
import helper.node;


public class RemoveDups2 {

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

    //TEST -----------------------------------
    public static void main(String[] args) {

        int[] list = {10, 12, 13, 12, 15, 16, 10, 20, 13, 15};
        node start = node.buildList(list);

        System.out.println("LinkedList before removing duplicates: ");
        node.printList(start);

        removeDups2(start);

        System.out.println("LinkedList after removing duplicates: ");
        node.printList(start);
    }
}
