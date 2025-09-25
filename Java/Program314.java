/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program314.java
//
//  Description : Doubly Circular Linked List (DCLL) in Java
//                Implements InsertFirst, InsertLast
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Node
{
    int data;
    Node next;
    Node prev;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyCLL
{
    private Node first;
    private Node last;
    private int iCount;

    public DoublyCLL()
    {
        System.out.println("Inside Constructor");
        this.first = null;
        this.last = null;
        this.iCount = 0;
    }

    public void insertFirst(int no)
    {
        Node newn = new Node(no);

        if(first == null && last == null) // List is empty
        {
            first = newn;
            last = newn;
        }
        else  // List has at least one node
        {
            newn.next = first;
            first.prev = newn;
            first = newn;
        }

        last.next = first;
        first.prev = last;

        iCount++;
    }

    public void insertLast(int no)
    {
        Node newn = new Node(no);

        if(first == null && last == null) // List is empty
        {
            first = newn;
            last = newn;
        }
        else  // List has at least one node
        {
            last.next = newn;
            newn.prev = last;
            last = newn;
        }

        last.next = first;
        first.prev = last;

        iCount++;
    }

    // Methods like Display, Count, InsertAtPos, DeleteFirst, DeleteLast, DeleteAtPos
    // can be implemented later
}

public class Program314
{
    public static void main(String[] args)
    {
        DoublyCLL dobj = new DoublyCLL();

        dobj.insertFirst(51);
        dobj.insertFirst(21);
        dobj.insertFirst(11);

        dobj.insertLast(101);
        dobj.insertLast(111);
        dobj.insertLast(121);

        // Display method can be implemented to print the list
    }
}
