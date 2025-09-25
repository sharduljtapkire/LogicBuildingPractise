/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program344.java
//
//  Description : Queue implementation using Singly Linked List in Java
//                Supports Enqueue (InsertLast), Dequeue (DeleteFirst), 
//                Display, and Count methods.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Node
{
    public int data;
    public Node next;
}

class QueueX
{
    private Node first;
    private int iCount;

    public QueueX()
    {
        first = null;
        iCount = 0;
    }

    public void Enqueue(int no)
    {
        Node temp = null;
        Node newn = new Node();

        newn.data = no;
        newn.next = null;

        if(first == null)
        {
            first = newn;
        }
        else
        {
            temp = first;

            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;
        }

        iCount++;
    }

    public int Dequeue()
    {
        Node temp = first;
        int value = 0;

        if(first == null)
        {
            System.out.println("Unable to remove as queue is empty");
            return -1;
        }
        else
        {
            temp = first;
            value = temp.data;

            first = first.next;
            temp = null; // For garbage collection

            iCount--;

            return value;
        }
    }

    public void Display()
    {
        Node temp = first;

        while(temp != null)
        {
            System.out.print("| " + temp.data + " |-");
            temp = temp.next;
        }
        System.out.println();
    }

    public int Count()
    {
        return iCount;
    }
}

class Program344
{
    public static void main(String[] args)
    {
        QueueX sobj = new QueueX();
        int iRet = 0;

        sobj.Enqueue(51);
        sobj.Enqueue(21);
        sobj.Enqueue(11);

        sobj.Display();
        iRet = sobj.Count();

        System.out.println("Number of elements from the queue : " + iRet);

        iRet = sobj.Dequeue();
        System.out.println("Removed element is : " + iRet);

        iRet = sobj.Dequeue();
        System.out.println("Removed element is : " + iRet);

        sobj.Display();
        iRet = sobj.Count();

        System.out.println("Number of elements from the queue : " + iRet);
    }
}
