/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program634.java
//  Description : Generic implementation of Stack in Java using Linked List
//                Supports Push, Pop, Display, and Count operations
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

class Node<T>
{
    public T data;
    public Node<T> next;

    public Node(T value)
    {
        data = value;
        next = null;
    }
}

class StackX<T>
{
    private Node<T> first;
    private int iCount;

    public StackX()
    {
        first = null;
        iCount = 0;
    }

    public void Push(T no)   // InsertFirst
    {
        Node<T> newn = new Node<T>(no);

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
            Node<T> temp = first;
            T value = temp.data;

            first = first.next;
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

public class Program634
{
    public static void main(String arg[])
    {
        StackX<Double> sobj = new StackX<Double>();
        Double iRet = 0.0;

        sobj.Push(51.23);
        sobj.Push(21.54);
        sobj.Push(11.89);

        sobj.Display();
        iRet = (double)sobj.Count();
        System.out.println("Number of elements from the stack : " + iRet);

        iRet = sobj.Pop();
        System.out.println("Popped element is : " + iRet);

        iRet = sobj.Pop();
        System.out.println("Popped element is : " + iRet);

        sobj.Display();
        iRet = (double)sobj.Count();
        System.out.println("Number of elements from the stack : " + iRet);
    }
}