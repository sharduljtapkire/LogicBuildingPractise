/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program343.java
//
//  Description : Stack implementation using Singly Linked List in Java
//                Supports Push (InsertFirst), Pop (DeleteFirst), Display, and Count methods.
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

class StackX
{
    private Node first;
    private int iCount;

    public StackX()
    {
        first = null;
        iCount = 0;
    }

    public void Push(int no)
    {
        Node newn = null;

        newn = new Node();

        newn.data = no;
        newn.next = null;

        newn.next = first;
        first = newn;

        iCount++;
    }

    public int Pop()
    {
        Node temp = first;
        int value = 0;

        if(first == null)
        {
            System.out.println("Unable to pop as stack is empty");
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

class Program343
{
    public static void main(String[] args)
    {
        StackX sobj = new StackX();
        int iRet = 0;

        sobj.Push(51);
        sobj.Push(21);
        sobj.Push(11);

        sobj.Display();
        iRet = sobj.Count();

        System.out.println("Number of elements from the stack : " + iRet);

        iRet = sobj.Pop();
        System.out.println("Poped element is : " + iRet);

        iRet = sobj.Pop();
        System.out.println("Poped element is : " + iRet);

        sobj.Display();
        iRet = sobj.Count();

        System.out.println("Number of elements from the stack : " + iRet);
    }
}
