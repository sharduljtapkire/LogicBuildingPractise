/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program317.java
//
//  Description : Doubly Circular Linked List (DCLL) in Java
//                Implements InsertFirst, InsertLast, DeleteFirst, Display, Count
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
        else // List has at least one node
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
        else // List has at least one node
        {
            last.next = newn;
            newn.prev = last;
            last = newn;
        }

        last.next = first;
        first.prev = last;

        iCount++;
    }

    public void deleteFirst()
    {
        if(first == null && last == null) // List is empty
        {
            return;
        }
        else if(first == last) // Only one node
        {
            first = null;
            last = null;
        }
        else // More than one node
        {
            first = first.next;
            first.prev = last;
            last.next = first;
        }

        iCount--;
    }

    public void display()
    {
        if(first == null && last == null)
        {
            System.out.println("LinkedList is empty");
            return;
        }

        System.out.println("Elements of the LinkedList are : ");
        Node temp = first;

        do
        {
            System.out.print("| " + temp.data + " | <=> ");
            temp = temp.next;
        } while(temp != first);

        System.out.println();
    }

    public int count()
    {
        return iCount;
    }
}

public class Program317
{
    public static void main(String[] args)
    {
        DoublyCLL dobj = new DoublyCLL();
        int iRet = 0;

        dobj.insertFirst(51);
        dobj.insertFirst(21);
        dobj.insertFirst(11);

        dobj.insertLast(101);
        dobj.insertLast(111);
        dobj.insertLast(121);

        dobj.display();
        iRet = dobj.count();
        System.out.println("Number of elements are : " + iRet);

        dobj.deleteFirst();
        dobj.display();
        iRet = dobj.count();
        System.out.println("Number of elements are : " + iRet);
    }
}
