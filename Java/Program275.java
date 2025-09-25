/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program275.java
//
//  Description : Demonstration of Singly Linear Linked List in Java.
//                Implements InsertFirst and InsertLast(Partial Version) functions.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Node
{
    public int data;
    public Node next;

    public Node(int value)   // Constructor to allocate memory
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

        if(head == null)       // LL is empty
        {
            head = newn;
        }
        else                   // LL contains at least 1 node
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

}

public class Program275
{
    public static void main(String[] args)
    {
        SinglyLL obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);
    }
}
