/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program299.java
//
//  Description : Singly Circular Linked List (Object-Oriented) in Java.
//                InsertFirst, InsertLast, InsertAtPos, DeleteFirst, DeleteLast,
//                DeleteAtPos, Display, Count methods are declared.
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

class SinglyCLL
{
    private Node head;
    private Node tail;
    private int iCount;

    // Constructor
    public SinglyCLL()
    {
        head = null;
        tail = null;
        iCount = 0;
    }

    public void InsertFirst(int no)
    {
        // TODO: Implement InsertFirst
    }

    public void InsertLast(int no)
    {
        // TODO: Implement InsertLast
    }

    public void InsertAtPos(int no, int pos)
    {
        // TODO: Implement InsertAtPos
    }

    public void DeleteFirst()
    {
        // TODO: Implement DeleteFirst
    }

    public void DeleteLast()
    {
        // TODO: Implement DeleteLast
    }

    public void DeleteAtPos(int pos)
    {
        // TODO: Implement DeleteAtPos
    }

    public void Display()
    {
        // TODO: Implement Display
    }

    public int Count()
    {
        return iCount;
    }
}

public class Program299
{
    public static void main(String[] args)
    {
        SinglyCLL sobj = new SinglyCLL();

        // Example usage
        // sobj.InsertFirst(10);
        // sobj.InsertLast(20);
        // sobj.Display();
        // System.out.println("Count: " + sobj.Count());
    }
}
