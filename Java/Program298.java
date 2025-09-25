/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program298.java
//
//  Description : Singly Circular Linked List template in Java.
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

    public SinglyCLL()
    {
        head = null;
        tail = null;
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
        // TODO: Implement Count
        return 0;
    }
}

public class Program298
{
    public static void main(String[] args)
    {
        SinglyCLL list = new SinglyCLL();

        // Example usage
        // list.InsertFirst(10);
        // list.InsertLast(20);
        // list.Display();
        // System.out.println("Count: " + list.Count());
    }
}
