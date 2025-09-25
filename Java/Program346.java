/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program346.java
//
//  Description : Generic Stack implementation for Double data using Singly Linked List in Java
//                Supports Push (InsertFirst), Pop (DeleteFirst), 
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

class StackX<T>
{
    private Node<T> first;
    private int iCount;

    public StackX()
    {
        first = null;
        iCount = 0;
    }

    public void Push(T no)
    {
        Node<T> newn = new Node<T>();

        newn.data = no;
        newn.next = null;

        newn.next = first;
        first = newn;

        iCount++;
    }

    public T Pop()
    {
        Node<T> temp = first;
        T value = null;

        if(first == null)
        {
            System.out.println("Unable to pop as stack is empty");
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

class Program346
{
    public static void main(String[] args)
    {
        StackX<Double> sobj = new StackX<>();
        int iRet = 0;
        Double dRet = 0.0;

        sobj.Push(51.23);
        sobj.Push(21.54);
        sobj.Push(11.89);

        sobj.Display();
        iRet = sobj.Count();

        System.out.println("Number of elements from the stack : " + iRet);

        dRet = sobj.Pop();
        System.out.println("Poped element is : " + dRet);

        dRet = sobj.Pop();
        System.out.println("Poped element is : " + dRet);

        sobj.Display();
        iRet = sobj.Count();

        System.out.println("Number of elements from the stack : " + iRet);
    }
}
