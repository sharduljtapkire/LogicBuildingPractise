/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program347.java
//
//  Description : Generic Queue implementation for Integer data using Singly Linked List in Java
//                Supports Enqueue (InsertLast), Dequeue (DeleteFirst), 
//                Display, and Count methods.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Node<T>
{
    public T data;
    public Node<T> next;
}

class QueueX<T>
{
    private Node<T> first;
    private int iCount;

    public QueueX()
    {
        first = null;
        iCount = 0;
    }

    public void Enqueue(T no)
    {
        Node<T> temp = null;
        Node<T> newn = new Node<T>();

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

    public T Dequeue()
    {
        Node<T> temp = first;
        T value = null;

        if(first == null)
        {
            System.out.println("Unable to remove as queue is empty");
            return null;
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
        Node<T> temp = first;

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

class Program347
{
    public static void main(String[] args)
    {
        QueueX<Integer> sobj = new QueueX<>();
        int iRet = 0;
        Integer val = 0;

        sobj.Enqueue(51);
        sobj.Enqueue(21);
        sobj.Enqueue(11);

        sobj.Display();
        iRet = sobj.Count();

        System.out.println("Number of elements from the queue : " + iRet);

        val = sobj.Dequeue();
        System.out.println("Removed element is : " + val);

        val = sobj.Dequeue();
        System.out.println("Removed element is : " + val);

        sobj.Display();
        iRet = sobj.Count();

        System.out.println("Number of elements from the queue : " + iRet);
    }
}
