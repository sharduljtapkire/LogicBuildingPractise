/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program329.java
//
//  Description : Singly Linked List (SLL) in Java
//                Implements InsertFirst, InsertLast, Display, and Count methods.
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

class SinglyLL
{
    private Node first;
    private int iCount;

    public SinglyLL()
    {
        System.out.println("Inside constructor");
        first = null;
        iCount = 0;
    }

    public void InsertFirst(int no)
    {
        Node newn = new Node();

        newn.data = no;
        newn.next = null;

        if(first == null)   // LL is empty
        {
            first = newn;
        }
        else    // LL contains at least 1 node
        {
            newn.next = first;
            first = newn;
        }
        iCount++;
    }

    public void InsertLast(int no)
    {
        Node newn = new Node();
        Node temp = null;

        newn.data = no;
        newn.next = null;

        if(first == null)   // LL is empty
        {
            first = newn;
        }
        else    // LL contains at least 1 node
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

    public void Display()
    {
        Node temp = first;

        while(temp != null)
        {
            System.out.print("| "+temp.data+" |-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public int Count()
    {
        return iCount;
    }
}

class Program329
{
    public static void main(String[] args)
    {
        SinglyLL sobj = new SinglyLL();
        int iRet = 0;

        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);

        sobj.InsertLast(101);
        sobj.InsertLast(111);        
        sobj.InsertLast(121);

        sobj.Display();
    
        iRet = sobj.Count();

        System.out.println("Number of elements in the LinkedList are : "+iRet);
    }
}
