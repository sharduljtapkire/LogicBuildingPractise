/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program338.java
//
//  Description : Queue implementation using Singly Linked List in Java
//                Handles char data type.
//                Implements enqueue (InsertLast), dequeue (DeleteFirst),
//                Display, and Count methods.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Node
{
    public char data;
    public Node next;
}

class QueueX
{
    private Node first;
    private int iCount;

    public QueueX()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void enqueue(char no)    // InsertLast
    {
        Node temp = null;
        Node newn = new Node();

        newn.data = no;
        newn.next = null;

        if(this.first == null)
        {
            this.first = newn;
        }
        else
        {
            temp = this.first;

            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;
        }

        iCount++;
    }

    public char dequeue()           // DeleteFirst
    {
        Node temp = first;
    
        if(this.first == null)  // Queue empty
        {
            System.out.println("Unable to remove as queue is empty");
            return (char)-1;
        }
        else
        {
            first = first.next;
            iCount--;
            return temp.data;  
        }
    }

    public void Display()
    {
        Node temp = this.first;

        while(temp != null)
        {
            System.out.print("| "+temp.data+" | - ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int Count()
    {
        return iCount;
    }
}

class Program338
{
    public static void main(String[] args)
    {
        QueueX sobj = new QueueX();
        int iRet = 0;
        char cRet = '\0';

        sobj.enqueue('A');
        sobj.enqueue('B');
        sobj.enqueue('C');
        sobj.enqueue('D');
        sobj.enqueue('E');

        sobj.Display();

        iRet = sobj.Count();
        System.out.println("Number of elements in the queue are : "+iRet);

        cRet = sobj.dequeue();
        System.out.println("Removed element from queue is : "+cRet);

        cRet = sobj.dequeue();
        System.out.println("Removed element from queue is : "+cRet);
        
        cRet = sobj.dequeue();
        System.out.println("Removed element from queue is : "+cRet);
        
        sobj.Display();

        iRet = sobj.Count();
        System.out.println("Number of elements in the queue are : "+iRet);
    }
}
