/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program548.java
//  Description : Demonstrates sorted insertion (unique style logic)
//                in a singly linked list and display functionality in Java,
//                with business logic separated into another class.
//  Author      : Shardul Tapkire
//  Date        : 28/09/2025
//
/////////////////////////////////////////////////////////////////////////////

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

class LinkedListX
{
    private Node head;

    public LinkedListX()
    {
        head = null;
    }

    // Insert node in sorted increasing order
    public void InsertSortedIncUnique(int no)
    {
        Node newn = new Node(no);

        if(head == null || no < head.data)
        {
            newn.next = head;
            head = newn;
        }
        else
        {
            Node temp = head;

            while(temp.next != null && temp.next.data < no)
            {
                temp = temp.next;
            }

            newn.next = temp.next;
            temp.next = newn;
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
}

public class Program548
{
    public static void main(String[] args)
    {
        LinkedListX obj = new LinkedListX();

        obj.InsertSortedIncUnique(11);
        obj.InsertSortedIncUnique(7);
        obj.InsertSortedIncUnique(21);
        obj.InsertSortedIncUnique(51);
        obj.InsertSortedIncUnique(40);
        obj.InsertSortedIncUnique(31);
        obj.InsertSortedIncUnique(51);
        obj.InsertSortedIncUnique(75);

        obj.Display();
    }
}
