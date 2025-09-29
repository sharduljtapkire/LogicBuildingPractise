/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program636.java
//  Description : Generic implementation of Queue in Java using Linked List
//                Supports Enqueue, Dequeue, Display, and Count operations
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

class Queuenode<T>
{
    public T data;
    public Queuenode<T> next;

    public Queuenode(T value)
    {
        data = value;
        next = null;
    }
}

class QueueX<T>
{
    private Queuenode<T> first;
    private int iCount;

    public QueueX()
    {
        first = null;
        iCount = 0;
    }

    public void Enqueue(T no)   // InsertLast
    {
        Queuenode<T> newn = new Queuenode<T>(no);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            Queuenode<T> temp = first;

            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;
        }

        iCount++;
    }

    public T Dequeue()   // DeleteFirst
    {
        if(first == null)
        {
            System.out.println("Unable to remove as queue is empty");
            return null;
        }
        else
        {
            Queuenode<T> temp = first;
            T value = temp.data;

            first = first.next;
            iCount--;

            return value;
        }
    }

    public void Display()
    {
        Queuenode<T> temp = first;

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

public class Program636
{
    public static void main(String arg[])
    {
        QueueX<Integer> sobj = new QueueX<Integer>();
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