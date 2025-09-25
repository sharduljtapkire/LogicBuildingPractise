/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program304.java
//
//  Description : Singly Circular Linked List (SCLL) in Java
//                Implements InsertFirst, InsertLast, Display, Count, DeleteFirst
//                DeleteLast (partial skeleton)
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
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
        System.out.println("Inside constructor of SinglyCLL");
        this.head = null;
        this.tail = null;
        this.iCount = 0;
    }

    // Insert at beginning
    public void InsertFirst(int no)
    {
        Node newn = new Node(no);

        if (head == null && tail == null)   // if(iCount == 0)
        {
            head = newn;
            tail = newn;
            tail.next = head;
        }
        else
        {
            newn.next = head;
            head = newn;
            tail.next = head;   // maintain circular property
        }

        iCount++;
    }

    // Insert at end
    public void InsertLast(int no)
    {
        Node newn = new Node(no);

        if (head == null && tail == null)   // if(iCount == 0)
        {
            head = newn;
            tail = newn;
            tail.next = head;
        }
        else
        {
            tail.next = newn;
            tail = newn;
            tail.next = head;
        }

        iCount++;
    }

    // InsertAtPos (placeholder)
    public void InsertAtPos(int no, int pos) {}

    // Delete first node
    public void DeleteFirst()
    {
        if (head == null && tail == null)   // empty
        {
            return;
        }
        else if (head == tail)              // single node
        {
            head = null;
            tail = null;
        }
        else                                // multiple nodes
        {
            head = head.next;
            tail.next = head;   // update circular link
        }

        iCount--;
    }

    // Delete last node (partial, not yet complete)
    public void DeleteLast()
    {
        if (head == null && tail == null)   // empty
        {
            return;
        }
        else if (head == tail)              // single node
        {
            head = null;
            tail = null;
        }
        else
        {
            // TODO: logic will be added later
        }

        iCount--;
    }

    // DeleteAtPos (placeholder)
    public void DeleteAtPos(int pos) {}

    // Display nodes
    public void Display()
    {
        if (head == null && tail == null)
        {
            return;
        }

        Node temp = head;

        do
        {
            System.out.print("| " + temp.data + " | -> ");
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println();
    }

    // Return number of nodes
    public int Count()
    {
        return iCount;
    }
}

public class Program304
{
    public static void main(String[] args)
    {
        SinglyCLL sobj = new SinglyCLL();
        int iRet = 0;

        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);

        sobj.InsertLast(101);
        sobj.InsertLast(111);
        sobj.InsertLast(121);

        sobj.Display();

        iRet = sobj.Count();
        System.out.println("Number of elements are : " + iRet);

        sobj.DeleteFirst();

        sobj.Display();

        iRet = sobj.Count();
        System.out.println("Number of elements are : " + iRet);
    }
}
