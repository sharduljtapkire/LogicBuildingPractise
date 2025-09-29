/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program566.java
//  Description : Demonstrates insertion at the end of a singly linked list,
//                displays it, reverses using extra space, and in-place reversal.
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

    public void ReverseLinkedListSpace()
    {
        int size = Count();
        if(size == 0)
            return;

        int[] arr = new int[size];
        Node temp = head;
        int i = 0;

        while(temp != null)
        {
            arr[i] = temp.data;
            i++;
            temp = temp.next;
        }

        temp = head;
        i = size - 1;

        while(temp != null)
        {
            temp.data = arr[i];
            i--;
            temp = temp.next;
        }
    }

    public void ReverseLinkedList()
    {
        Node Previous = null;
        Node Current = head;
        Node Next = null;

        while(Current != null)
        {
            Next = Current.next;
            Current.next = Previous;
            Previous = Current;
            Current = Next;
        }

        head = Previous;
    }
}

public class Program566
{
    public static void main(String[] args)
    {
        LinkedListX obj = new LinkedListX();

        obj.InsertLast(11);
        obj.InsertLast(21);
        obj.InsertLast(51);
        obj.InsertLast(101);
        obj.InsertLast(111);

        obj.Display();

        // Reverse using extra space (O(N) space, O(N) time)
        obj.ReverseLinkedListSpace();
        obj.Display();

        // Reverse in-place (O(1) space, O(N) time)
        obj.ReverseLinkedList();
        obj.Display();
    }
}
