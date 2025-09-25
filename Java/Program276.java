/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program276.java
//
//  Description : Demonstration of Singly Linear Linked List in Java.
//                Implements InsertFirst, InsertLast(Partial), and Display.
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

    // Insert at beginning
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

    
    public void Display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print("| " + temp.data + " |->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class Program276
{
    public static void main(String[] args)
    {
        SinglyLL obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();
    }
}
