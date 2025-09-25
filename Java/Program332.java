/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program332.java
//
//  Description : Singly Circular Linked List (SCLL) in Java
//                Implements InsertFirst, InsertLast, InsertAtPos,
//                DeleteFirst, DeleteLast, DeleteAtPos, Display, and Count methods.
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

class SinglyCLL
{
    private Node first;
    private Node last;
    private int iCount;

    public SinglyCLL()
    {
        first = null;
        last = null;
        iCount = 0;
    }

    public void InsertFirst(int no)
    {}

    public void InsertLast(int no)
    {}
    
    public void InsertAtPos(int no, int pos)
    {}
    
    public void DeleteFirst()
    {}

    public void DeleteLast()
    {}

    public void DeleteAtPos(int pos)
    {}
    
    public void Display()
    {}

    public int Count()
    {
        return iCount;
    }
}

class Program332
{
    public static void main(String[] args)
    {
        SinglyCLL sobj = new SinglyCLL();
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

        sobj.InsertAtPos(105,5);
        sobj.Display();
    
        iRet = sobj.Count();
        System.out.println("Number of elements in the LinkedList are : "+iRet);

        sobj.DeleteAtPos(5);
        sobj.Display();
    
        iRet = sobj.Count();
        System.out.println("Number of elements in the LinkedList are : "+iRet);
    }
}
