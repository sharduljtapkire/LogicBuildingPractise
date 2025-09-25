/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program327.java
//
//  Description : Singly Linked List (SLL) in Java
//                Implements basic structure with constructor.
//                Can be extended to add Insert, Delete, Display, Count methods.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Node
{
    public int no;
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

    // Methods like InsertFirst, InsertLast, DeleteFirst, DeleteLast, Display, Count can be added here
}

class Program327
{
    public static void main(String[] args)
    {
        SinglyLL sobj = new SinglyLL();
    }
}
