/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program278.java
//
//  Description : Demonstration of Singly Linear Linked List in Java.
//                Implements InsertFirst, InsertLast, Display, and Count methods.
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

    // Insert at end
    public void InsertLast(int no)
    {
        Node newn = new Node(no);

        if(head == null) // LL is empty
        {
            head = newn;
        }
        else // LL contains at least 1 node
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
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

public class Program278
{
    public static void main(String[] args)
    {
        SinglyLL obj = new SinglyLL();
        int iRet = 0;

        obj.InsertFirst(101);
        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();

        iRet = obj.Count();
        System.out.println("Number of elements in the linked list are : " + iRet);

        obj.InsertLast(111);
        obj.InsertLast(121);
        obj.InsertLast(151);

        obj.Display();

        iRet = obj.Count();
        System.out.println("Number of elements in the linked list are : " + iRet);
    }
}
