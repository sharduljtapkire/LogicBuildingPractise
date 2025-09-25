/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program311.java
//
//  Description : Singly Circular Linked List (SCLL) in Java
//                Implements InsertFirst, InsertLast, Display, Count
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class SinglyCLL
{
    private Node first;
    private Node last;

    public SinglyCLL()
    {
        this.first = null;
        this.last = null;
    }

    public void insertFirst(int no)
    {
        Node newn = new Node(no);

        if(first == null && last == null)
        {
            first = newn;
            last = newn;
            last.next = first;
        }
        else
        {
            newn.next = first;
            first = newn;
            last.next = first;
        }
    }

    public void insertLast(int no)
    {
        Node newn = new Node(no);

        if(first == null && last == null)
        {
            first = newn;
            last = newn;
            last.next = first;
        }
        else
        {
            last.next = newn;
            last = newn;
            last.next = first;
        }
    }

    public void display()
    {
        if(first == null && last == null)
        {
            return;
        }

        Node temp = first;

        do
        {
            System.out.print("| " + temp.data + " | -> ");
            temp = temp.next;
        } while(temp != first);

        System.out.println();
    }

    public int count()
    {
        int iCount = 0;

        if(first == null && last == null)
        {
            return iCount;
        }

        Node temp = first;

        do
        {
            iCount++;
            temp = temp.next;
        } while(temp != first);

        return iCount;
    }
}

public class Program311
{
    public static void main(String[] args)
    {
        SinglyCLL list = new SinglyCLL();

        list.insertFirst(51);
        list.insertFirst(21);
        list.insertFirst(11);

        list.insertLast(101);
        list.insertLast(111);
        list.insertLast(121);

        list.display();

        int iRet = list.count();
        System.out.println("Number of elements are : " + iRet);
    }
}
