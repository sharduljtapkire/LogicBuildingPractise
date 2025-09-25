/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program285.java
//
//  Description : Demonstration of Singly Linear Linked List in Java.
//                Implements InsertFirst, InsertLast, InsertAtPos, DeleteFirst,
//                DeleteLast, DeleteAtPos, Display, and Count.
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

    public void InsertFirst(int no)
    {
        Node newn = new Node(no);
        newn.next = head;
        head = newn;
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
            temp.next = newn;
        }
    }

    public void InsertAtPos(int no, int pos)
    {
        int size = Count();
        if(pos < 1 || pos > size + 1)
        {
            System.out.println("Invalid position");
            return;
        }
        if(pos == 1)
        {
            InsertFirst(no);
        }
        else if(pos == size + 1)
        {
            InsertLast(no);
        }
        else
        {
            Node temp = head;
            for(int i = 1; i <= pos-2; i++)
            {
                temp = temp.next;
            }
            Node newn = new Node(no);
            newn.next = temp.next;
            temp.next = newn;
        }
    }

    public void DeleteFirst()
    {
        if(head == null)
            return;
        else
            head = head.next;
    }

    public void DeleteLast()
    {
        if(head == null)
            return;
        else if(head.next == null)
            head = null;
        else
        {
            Node temp = head;
            while(temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void DeleteAtPos(int pos)
    {
        int size = Count();
        if(pos < 1 || pos > size)
        {
            System.out.println("Invalid position");
            return;
        }
        if(pos == 1)
        {
            DeleteFirst();
        }
        else if(pos == size)
        {
            DeleteLast();
        }
        else
        {
            Node temp = head;
            for(int i = 1; i <= pos-2; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public void Display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print("| " + temp.data + " | -> ");
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
}

public class Program285
{
    public static void main(String[] args)
    {
        SinglyLL obj = new SinglyLL();
        int iRet = 0;

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.InsertLast(101);
        obj.InsertLast(111);
        obj.InsertLast(121);
        obj.InsertLast(151);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements are : " + iRet);

        obj.InsertAtPos(105, 5);
        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements are : " + iRet);

        obj.DeleteAtPos(5);
        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements are : " + iRet);
    }
}
