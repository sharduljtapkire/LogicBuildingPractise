/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program637.java
//  Description : Generic implementation of Queue and Stack in Java using
//                Linked List. Includes Enqueue, Dequeue, Push, Pop, Display,
//                and Count operations.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////
//
//  Class :         Queuenode
//  Description :   Node structure for Queue
//  Author :        Shardul Tapkire
//
///////////////////////////////////////////////////////////////////////
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

///////////////////////////////////////////////////////////////////////
//
//  Class :         QueueX
//  Description :   Generic implementation of Queue (FIFO)
//  Author :        Shardul Tapkire
//
///////////////////////////////////////////////////////////////////////
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

///////////////////////////////////////////////////////////////////////
//
//  Class :         Stacknode
//  Description :   Node structure for Stack
//  Author :        Shardul Tapkire
//
///////////////////////////////////////////////////////////////////////
class Stacknode<T>
{
    public T data;
    public Stacknode<T> next;

    public Stacknode(T value)
    {
        data = value;
        next = null;
    }
}

///////////////////////////////////////////////////////////////////////
//
//  Class :         StackX
//  Description :   Generic implementation of Stack (LIFO)
//  Author :        Shardul Tapkire
//
///////////////////////////////////////////////////////////////////////
class StackX<T>
{
    private Stacknode<T> first;
    private int iCount;

    public StackX()
    {
        first = null;
        iCount = 0;
    }

    public void Push(T no)   // InsertFirst
    {
        Stacknode<T> newn = new Stacknode<T>(no);

        newn.next = first;
        first = newn;

        iCount++;
    }

    public T Pop()   // DeleteFirst
    {
        if(first == null)
        {
            System.out.println("Unable to pop as stack is empty");
            return null;
        }
        else
        {
            Stacknode<T> temp = first;
            T value = temp.data;

            first = first.next;
            iCount--;

            return value;
        }
    }

    public void Display()
    {
        Stacknode<T> temp = first;

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

///////////////////////////////////////////////////////////////////////
//
//  Class :         Program637
//  Description :   Demonstrates usage of generic Queue and Stack
//  Author :        Shardul Tapkire
//
///////////////////////////////////////////////////////////////////////
public class Program637
{
    public static void main(String arg[])
    {
        // Demonstration of Queue
        QueueX<Integer> qobj = new QueueX<Integer>();
        qobj.Enqueue(51);
        qobj.Enqueue(21);
        qobj.Enqueue(11);

        qobj.Display();
        System.out.println("Number of elements in queue : " + qobj.Count());

        System.out.println("Removed element : " + qobj.Dequeue());
        qobj.Display();

        // Demonstration of Stack
        StackX<Double> sobj = new StackX<Double>();
        sobj.Push(51.23);
        sobj.Push(21.54);
        sobj.Push(11.89);

        sobj.Display();
        System.out.println("Number of elements in stack : " + sobj.Count());

        System.out.println("Popped element : " + sobj.Pop());
        sobj.Display();
    }
}