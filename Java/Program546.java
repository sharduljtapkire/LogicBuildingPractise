/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program546.java
//  Description : Demonstrates basic singly linked list structure and display
//                functionality in Java.
//  Author      : Shardul Tapkire
//  Date        : 28/09/2025
//
/////////////////////////////////////////////////////////////////////////////

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

public class Program546
{
    public void Display(Node first)
    {
        while(first != null)
        {
            System.out.print("| " + first.data + " | -> ");
            first = first.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args)
    {
        Node head = null;

        Program546 obj = new Program546();
        obj.Display(head);
    }
}
