/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program328.java
//
//  Description : Singly Linked List (SLL) in Java
//                Implements InsertFirst and InsertLast methods.
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
}

class Program328
{
    public static void main(String[] args)
    {
        SinglyLL sobj = new SinglyLL();

        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);

        sobj.InsertLast(101);
        sobj.InsertLast(111);        
        sobj.InsertLast(121);
    }
}
