/**
 * Write code to partition a linked list around a value x, such that all
 * nodes less than x come before all nodes greater than or equal to x.
 */

package com.chapter2;
import helper.node;

public class Partition {
    static node partition(node n, int x) {
        node head1 = null, tail1 = null;
        node head2 = null, tail2 = null;
        while (n != null) {
            if (n.data < x) {
                if (head1 == null) {
                    head1 = tail1 = n;
                } else {
                    tail1.next = n;
                    tail1 = n;
                }
            } else {
                if (head2 == null) {
                    head2 = tail2 = n;
                } else {
                    tail2.next = n;
                    tail2 = n;
                }
            }
            n = n.next;
        }

        //Trim tails
        if (tail1 != null) tail1.next = null;
        if (tail2 != null) tail2.next = null;

        //List is empty
        if (head1 == null) return head2;
        tail1.next = head2;
        return head1;
    }

    //TEST----------------------------------
    public static void main(String[] args) {
        int[] list = {9,2,7,4,6,5,3,8,1};
        node n = node.buildList(list);
        node.printList(n);
        n = node.buildList(list);
        node.printList(partition(n, 6));
        n = node.buildList(list);
        node.printList(partition(n, 7));
        n = node.buildList(list);
        node.printList(partition(n, 100));
    }
}
