/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program301.java
//
//  Description : Singly Circular Linked List (SCLL) in Java
//                Implements InsertFirst, InsertLast, and Count
//                Display & Delete methods declared but not implemented.
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
            tail.next = head;   // circular link
        }
        else
        {
            newn.next = head;
            head = newn;
            tail.next = head;   // maintain circular link
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
            tail.next = head;   // circular link
        }
        else
        {
            tail.next = newn;
            tail = newn;
            tail.next = head;   // maintain circular link
        }

        iCount++;
    }

    // Placeholder methods
    public void InsertAtPos(int no, int pos) {}
    public void DeleteFirst() {}
    public void DeleteLast() {}
    public void DeleteAtPos(int pos) {}
    public void Display() {}

    // Return number of nodes
    public int Count()
    {
        return iCount;
    }
}

public class Program301
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

        iRet = sobj.Count();
        System.out.println("Number of elements are : " + iRet);
    }
}
