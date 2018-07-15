package helper;


public class node {
    public int data;
    public node next;

    public node(int data) {
        this.data = data;
    }

    //Method to create a LinkedList from a given array
    public static node buildList(int[] a) {
        if (a == null || a.length == 0) return null;
        node n = new node(a[0]);
        node head = n;
        for (int i = 1; i < a.length; i++) {
            n.next = new node(a[i]);
            n = n.next;
        }
        return head;
    }

    //Method to Print LinkedList
    public static void printList(node n) {
        while (n != null) {
            System.out.print(n.data + "-->");
            n = n.next;
        }
        System.out.println(" ");
    }

    public String toString() {
        return String.valueOf(data);
    }
}
