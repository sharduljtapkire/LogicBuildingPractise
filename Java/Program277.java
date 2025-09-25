/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program277.java
//
//  Description : Demonstration of Singly Linear Linked List in Java.
//                Implements InsertFirst, Display, and Count methods.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Node
{
    public int data;
    public Node next;

    public Node(int value) // Constructor to create a node
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

    // Insert at beginning
    public void InsertFirst(int no)
    {
        Node newn = new Node(no);

        if(head == null) // LL is empty
        {
            head = newn;
        }
        else // LL contains at least 1 node
        {
            newn.next = head;
            head = newn;
        }
    }

    public void InsertLast(int no)
    {
        Node newn = new Node(no);

        if(head == null)       // LL is empty
        {
            head = newn;
        }
        else                   // LL contains at least 1 node
        {

        }
    }

    // Display the linked list
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

    // Count the number of nodes
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

public class Program277
{
    public static void main(String[] args)
    {
        SinglyLL obj = new SinglyLL();
        int iRet = 0;

        obj.InsertFirst(121);
        obj.InsertFirst(111);
        obj.InsertFirst(101);
        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();

        iRet = obj.Count();

        System.out.println("Number of elements in the linked list are : " + iRet);
    }
}
