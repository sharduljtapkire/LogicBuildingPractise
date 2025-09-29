/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program563.java
//  Description : Demonstrates sorted insertion in a singly linked list,
//                and checks for loops using fast-slow pointers.
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
        Node teacher = head;
        Node student = head;

        while(teacher != null && teacher.next != null)
        {
            teacher = teacher.next.next;
            student = student.next;

            if(teacher == student)
            {
                return true;
            }
        }

        return false;
    }
}

public class Program563
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

        boolean bRet = obj.CheckLoop();

        if(bRet)
        {
            System.out.println("Loop is there in Linked List");
        }
        else
        {
            System.out.println("There is no loop in Linked List");
        }
    }
}
