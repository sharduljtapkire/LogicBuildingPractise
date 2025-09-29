/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program551.java
//  Description : Demonstrates sorted insertion in a singly linked list
//                with duplicate check (no duplicates allowed) including
//                negative values.
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

    // Insert node in sorted increasing order (reject duplicates)
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

            // Duplicate check
            if(temp.data == no || (temp.next != null && temp.next.data == no))
            {
                return;
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

public class Program551
{
    public static void main(String[] args)
    {
        LinkedListX obj = new LinkedListX();

        obj.InsertSortedIncUnique(-11);
        obj.InsertSortedIncUnique(-7);
        obj.InsertSortedIncUnique(-90);
        obj.InsertSortedIncUnique(-21);
        obj.InsertSortedIncUnique(-89);
        obj.InsertSortedIncUnique(-50);
        obj.InsertSortedIncUnique(-90); // duplicate

        obj.Display();
    }
}
