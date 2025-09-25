/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program295.java
//
//  Description : Doubly Linear Linked List in Java.
//                Implements InsertFirst, InsertLast, InsertAtPos, DeleteFirst,
//                DeleteLast, DeleteAtPos, Display, Count.
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

    public void InsertAtPos(int no, int pos)
    {
        int iCount = Count();

        if(pos < 1 || pos > iCount + 1)
        {
            System.out.println("Invalid position");
            return;
        }

        if(pos == 1)
        {
            InsertFirst(no);
        }
        else if(pos == iCount + 1)
        {
            InsertLast(no);
        }
        else
        {
            Node newn = new Node(no);
            Node temp = head;

            for(int i = 1; i < pos - 1; i++)
            {
                temp = temp.next;
            }

            newn.next = temp.next;
            newn.next.prev = newn; // $
            temp.next = newn;
            newn.prev = temp;      // $
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
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.prev.next = null; // $
        }
    }

    public void DeleteAtPos(int pos)
    {
        int iCount = Count();

        if(pos < 1 || pos > iCount)
        {
            System.out.println("Invalid position");
            return;
        }

        if(pos == 1)
        {
            DeleteFirst();
        }
        else if(pos == iCount)
        {
            DeleteLast();
        }
        else
        {
            Node temp = head;
            for(int i = 1; i < pos - 1; i++)
            {
                temp = temp.next;
            }
            Node target = temp.next;
            temp.next = target.next;
            target.next.prev = temp; // $
        }
    }
}

public class Program295
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

        obj.InsertAtPos(105, 5);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements are : " + iRet);
    }
}
