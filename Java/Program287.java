/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program287.java
//
//  Description : Doubly Linear Linked List in Java.
//                Implements InsertFirst.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Node
{
    public int data;
    public Node next;
    public Node prev;   

    public Node(int value)
    {
        data = value;
        next = null;
        prev = null;  // $
    }
}

class DoublyLL
{
    private Node head;

    public DoublyLL()
    {
        head = null;
    }

    public void Display()
    {
        
    }

    public int Count()
    {
        return 0;  
    }

    public void InsertFirst(int no)
    {
        Node newn = new Node(no);

        if(head == null)
        {
            head = newn;
        }
        else
        {
            newn.next = head;
            head.prev = newn;
            head = newn;
        }
    }

    public void InsertLast(int no)
    {
        
    }

    public void InsertAtPos(int no, int pos)
    {
        
    }

    public void DeleteFirst()
    {
       
    }

    public void DeleteLast()
    {
        
    }

    public void DeleteAtPos(int pos)
    {
        
    }
}

public class Program287
{
    public static void main(String[] args)
    {
        DoublyLL obj = new DoublyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);
    }
}
