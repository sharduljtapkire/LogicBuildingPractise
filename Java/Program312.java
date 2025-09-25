/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program312.java
//
//  Description : Doubly Circular Linked List (DCLL) in Java
//                Skeleton includes InsertFirst, InsertLast, InsertAtPos,
//                DeleteFirst, DeleteLast, DeleteAtPos, Display, Count
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
        this.first = null;
        this.last = null;
        this.iCount = 0;
    }

    public void display()
    {
        if(first == null && last == null)
        {
            return;
        }

        Node temp = first;

        do
        {
            System.out.print("| " + temp.data + " | <-> ");
            temp = temp.next;
        } while(temp != first);

        System.out.println();
    }

    public int count()
    {
        return iCount;
    }

    public void insertFirst(int no)
    {
        Node newn = new Node(no);

        if(first == null && last == null)
        {
            first = newn;
            last = newn;
            first.next = first;
            first.prev = first;
        }
        else
        {
            newn.next = first;
            newn.prev = last;
            first.prev = newn;
            last.next = newn;
            first = newn;
        }

        iCount++;
    }

    public void insertLast(int no)
    {
        Node newn = new Node(no);

        if(first == null && last == null)
        {
            first = newn;
            last = newn;
            first.next = first;
            first.prev = first;
        }
        else
        {
            newn.prev = last;
            newn.next = first;
            last.next = newn;
            first.prev = newn;
            last = newn;
        }

        iCount++;
    }

    public void insertAtPos(int no, int pos)
    {
        // To be implemented
    }

    public void deleteFirst()
    {
        // To be implemented
    }

    public void deleteLast()
    {
        // To be implemented
    }

    public void deleteAtPos(int pos)
    {
        // To be implemented
    }
}

public class Program312
{
    public static void main(String[] args)
    {
        DoublyCLL dobj = new DoublyCLL();

        // Example usage:
        dobj.insertFirst(11);
        dobj.insertFirst(21);
        dobj.insertLast(101);
        dobj.display();

        System.out.println("Number of elements: " + dobj.count());
    }
}
