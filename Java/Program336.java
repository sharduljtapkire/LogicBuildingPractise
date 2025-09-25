/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program336.java
//
//  Description : Queue implementation using Singly Linked List in Java
//                Implements enqueue (InsertLast), dequeue (DeleteFirst),
//                Display, and Count methods.
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

class QueueX
{
    private Node first;
    private int iCount;

    public QueueX()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void enqueue(int no)    // InsertLast
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

    public int dequeue()           // DeleteFirst
    {
        Node temp = first;
    
        if(this.first == null)  // Queue empty
        {
            System.out.println("Unable to remove as queue is empty");
            return -1;
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

class Program336
{
    public static void main(String[] args)
    {
        QueueX sobj = new QueueX();
        int iRet = 0;

        sobj.enqueue(10);
        sobj.enqueue(20);
        sobj.enqueue(30);
        sobj.enqueue(40);
        sobj.enqueue(50);

        sobj.Display();

        iRet = sobj.Count();
        System.out.println("Number of elements in the queue are : "+iRet);

        iRet = sobj.dequeue();
        System.out.println("Removed element from queue is : "+iRet);

        iRet = sobj.dequeue();
        System.out.println("Removed element from queue is : "+iRet);
        
        iRet = sobj.dequeue();
        System.out.println("Removed element from queue is : "+iRet);
        
        sobj.Display();

        iRet = sobj.Count();
        System.out.println("Number of elements in the queue are : "+iRet);
    }
}
