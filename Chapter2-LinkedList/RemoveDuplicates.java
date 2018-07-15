/**
 * Write code to remove duplicates from an unsorted linked list.
 *
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 *
 * Below solution is implemented using a tmp buffer.
 */

package com.chapter2;

import java.util.*;
import helper.node;

public class RemoveDups {


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

    // TEST---------------------------------
    public static void main(String[] args) {

        int[] list = {10, 12, 13, 12, 15, 16, 10, 20, 13, 15};
        node start = node.buildList(list);

        System.out.println("LinkedList before removing duplicates: ");
        node.printList(start);

        deleteDups(start);

        System.out.println("LinkedList after removing duplicates: ");
        node.printList(start);


    }

}
