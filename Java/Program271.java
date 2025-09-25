/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program271.java
//
//  Description : Demonstration of Singly Linear Linked List in Java.
//                Creates a Node structure and initializes head pointer.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Node
{
    public int data;
    public Node next;

    public Node(int value)
    {
        data = value;
        next = null;
    }
}

class SinglyLL
{
    private Node head;

    public SinglyLL()
    {
        head = null;
    }
}

public class Program271
{
    public static void main(String[] args)
    {
        SinglyLL obj = new SinglyLL();

        // At this point, list is empty (head = null), same as C code
        System.out.println("Singly Linear Linked List initialized.");
    }
}
