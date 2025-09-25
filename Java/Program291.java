/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program291.java
//
//  Description : Doubly Linear Linked List in Java.
//                Implements InsertFirst, InsertLast, DeleteFirst, Display, Count.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Node
{
    public int data;
    public Node next;
    public Node prev;  // $

    public Node(int value)
    {
        data = value;
        next = null;
        prev = null; // $
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
        System.out.print("NULL <=> ");
        Node temp = head;
        while(temp != null)
        {
            System.out.print("| " + temp.data + " | <=> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public int Count()
    {
        int iCount = 0;
        Node temp = head;
        while(temp != null)
        {
            iCount++;
            temp = temp.next;
        }
        return iCount;
    }

    public void InsertFirst(int no)
    {
        Node newn = new Node(no);

        if(head == null)
        {
            head = newn;
        }
        else
        {
            newn.next = head;
            head.prev = newn; // $
            head = newn;
        }
    }

    public void InsertLast(int no)
    {
        Node newn = new Node(no);

        if(head == null)
        {
            head = newn;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            newn.prev = temp; // $
            temp.next = newn;
        }
    }

    public void DeleteFirst()
    {
        if(head == null)
        {
            return;
        }
        else if(head.next == null)
        {
            head = null;
        }
        else
        {
            head = head.next;
            head.prev = null; // $
        }
    }

    public void DeleteLast()
    {
        // Placeholder
    }

    public void InsertAtPos(int no, int pos)
    {
        // Placeholder
    }

    public void DeleteAtPos(int pos)
    {
        // Placeholder
    }
}

public class Program291
{
    public static void main(String[] args)
    {
        DoublyLL obj = new DoublyLL();
        int iRet = 0;

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.InsertLast(101);
        obj.InsertLast(111);
        obj.InsertLast(121);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements are : " + iRet);

        obj.DeleteFirst();

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements are : " + iRet);
    }
}
