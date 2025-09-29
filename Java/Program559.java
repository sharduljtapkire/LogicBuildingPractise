/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program559.java
//  Description : Demonstrates sorted insertion in a singly linked list
//                with duplicate check (no duplicates allowed) and finds
//                the middle element of the list, handling empty list case.
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

    public int MiddleElement()
    {
        if(head == null)
        {
            return -1; // empty list
        }

        int count = 1;
        Node temp = head;

        while(temp != null)
        {
            temp = temp.next;
            count++;
        }

        int middleIndex = count / 2;
        System.out.println("Middle index is : " + middleIndex);

        temp = head;
        for(int i = 1; i < middleIndex; i++)
        {
            temp = temp.next;
        }

        return temp.data;
    }
}

public class Program559
{
    public static void main(String[] args)
    {
        LinkedListX obj = new LinkedListX();
        int iRet = 0;

        obj.InsertSortedIncUnique(11);

        obj.Display();

        iRet = obj.MiddleElement();
        System.out.println("Middle element is : " + iRet);
    }
}
