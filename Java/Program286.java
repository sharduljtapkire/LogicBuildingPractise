/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program286.java
//
//  Description : Skeleton for Doubly Linear Linked List in Java.
//                Contains declarations for InsertFirst, InsertLast,
//                InsertAtPos, DeleteFirst, DeleteLast, DeleteAtPos,
//                Display, and Count methods.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Node
{
    public int data;
    public Node next;
    public Node prev;  

    public Node(int value)
    {
        data = value;
        next = null;
        prev = null;
    }
}

class DoublyLL
{
    private Node head;

    public DoublyLL()
    {
        head = null;
    }

    public void Display()
    {
        // Empty implementation
    }

    public int Count()
    {
        return 0;  // Empty implementation
    }

    public void InsertFirst(int no)
    {
        // Empty implementation
    }

    public void InsertLast(int no)
    {
        // Empty implementation
    }

    public void InsertAtPos(int no, int pos)
    {
        // Empty implementation
    }

    public void DeleteFirst()
    {
        // Empty implementation
    }

    public void DeleteLast()
    {
        // Empty implementation
    }

    public void DeleteAtPos(int pos)
    {
        // Empty implementation
    }
}

public class Program286
{
    public static void main(String[] args)
    {
        DoublyLL obj = new DoublyLL();
        // List is empty initially
    }
}
