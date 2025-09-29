/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program564.java
//  Description : Demonstrates insertion at the end of a singly linked list
//                and displays the linked list.
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

    public void InsertLast(int no)
    {
        Node newn = new Node(no);

        if(head == null)
        {
            head = newn;
        }
        else
        {
            Node temp = head;

            while(temp.next != null)
            {
                temp = temp.next;
            }

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

public class Program564
{
    public static void main(String[] args)
    {
        LinkedListX obj = new LinkedListX();

        obj.InsertLast(11);
        obj.InsertLast(21);
        obj.InsertLast(51);

        obj.Display();
    }
}
