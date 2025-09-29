/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program560.java
//  Description : Demonstrates sorted insertion in a singly linked list
//                with duplicate check and two methods to find the middle
//                element (slow-fast pointer and count-based).
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

    public int MiddleElement()  // N + N/2 approach
    {
        if(head == null)
        {
            return -1;
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

    public int MiddleElementX()  // N/2 fast-slow pointer approach
    {
        if(head == null)
        {
            return -1;
        }

        Node student = head;
        Node teacher = head;

        while(teacher != null && teacher.next != null)
        {
            teacher = teacher.next.next;
            student = student.next;
        }

        return student.data;
    }
}

public class Program560
{
    public static void main(String[] args)
    {
        LinkedListX obj = new LinkedListX();
        int iRet = 0;

        obj.InsertSortedIncUnique(11);
        obj.InsertSortedIncUnique(21);

        obj.Display();

        iRet = obj.MiddleElementX();
        System.out.println("Middle element is : " + iRet);
    }
}
