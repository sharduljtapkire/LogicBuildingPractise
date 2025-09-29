/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program561.java
//  Description : Demonstrates sorted insertion in a singly linked list,
//                and creates a loop for testing purposes.
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
    public Node head;

    public LinkedListX()
    {
        head = null;
    }

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

            if((temp.next == null && temp.data == no) ||
               (temp.next != null && (temp.data == no || temp.next.data == no)))
            {
                return; // reject duplicate
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

    public boolean CheckLoop()
    {
        return true; // placeholder
    }
}

public class Program561
{
    public static void main(String[] args)
    {
        LinkedListX obj = new LinkedListX();

        obj.InsertSortedIncUnique(11);
        obj.InsertSortedIncUnique(21);
        obj.InsertSortedIncUnique(51);
        obj.InsertSortedIncUnique(101);
        obj.InsertSortedIncUnique(111);
        obj.InsertSortedIncUnique(121);

        // Creating loop: last node points to the 3rd node
        Node last = obj.head.next.next.next.next.next;
        Node temp = obj.head.next.next;

        last.next = temp;

        obj.Display(); // **Warning**: This will cause infinite loop due to the loop
    }
}
