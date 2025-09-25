/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program274.java
//
//  Description : Demonstration of Singly Linear Linked List in Java.
//                Manually creates three nodes, assigns data, links them,
//                and prints values.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Node
{
    public int data;
    public Node next;
}

public class Program274
{
    public static void main(String[] args)
    {
        Node head = null;

        Node newn1 = null;
        Node newn2 = null;
        Node newn3 = null;

        newn1 = new Node();
        newn2 = new Node();
        newn3 = new Node();

        // Assign data
        newn1.data = 11;
        newn2.data = 21;
        newn3.data = 51;

        // Link nodes
        newn1.next = newn2;
        newn2.next = newn3;
        newn3.next = null;

        head = newn1;

        // Print elements
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
    }
}
