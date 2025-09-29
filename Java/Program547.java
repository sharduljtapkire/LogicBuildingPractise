/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program547.java
//  Description : Demonstrates sorted insertion in a singly linked list
//                and display functionality in Java.
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

public class Program547
{
    private Node head;

    public Program547()
    {
        head = null;
    }

    // Insert node in increasing order
    public void InsertSortedInc(int no)
    {
        Node newn = new Node(no);

        // First element
        if(head == null)
        {
            head = newn;
        }
        else
        {
            if(no < head.data)   // If it is less than first element
            {
                newn.next = head;
                head = newn;
                return;
            }

            Node temp = head;

            while(temp.next != null)
            {
                if((temp.data < no) && (temp.next.data > no))
                {
                    break;
                }
                temp = temp.next;
            }

            if(temp.next == null && no > temp.data) // If it is greater than last element
            {
                temp.next = newn;
                return;
            }

            // If it lies in between the LL
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

    public static void main(String[] args)
    {
        Program547 obj = new Program547();

        obj.InsertSortedInc(11);
        obj.InsertSortedInc(7);
        obj.InsertSortedInc(21);
        obj.InsertSortedInc(51);
        obj.InsertSortedInc(40);
        obj.InsertSortedInc(31);
        obj.InsertSortedInc(51);
        obj.InsertSortedInc(75);

        obj.Display();
    }
}
