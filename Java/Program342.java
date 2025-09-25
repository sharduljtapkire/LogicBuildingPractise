/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program342.java
//
//  Description : Generic Queue implementation using Singly Linked List in Java
//                Demonstrates usage with Double data type.
//                Implements enqueue (InsertLast), dequeue (DeleteFirst),
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

class QueueX<T>
{
    private Node<T> first;
    private int iCount;

    public QueueX()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void enqueue(T no)    // InsertLast
    {
        Node<T> temp = null;
        Node<T> newn = new Node<T>();

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

    public T dequeue()           // DeleteFirst
    {
        Node<T> temp = first;
    
        if(this.first == null)  // Queue empty
        {
            System.out.println("Unable to remove as queue is empty");
            return null;
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
        Node<T> temp = this.first;

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

class Program342
{
    public static void main(String[] args)
    {
        QueueX<Double> sobj = new QueueX<>();
        int iRet = 0;
        double dRet = 0.0;

        sobj.enqueue(10.0);
        sobj.enqueue(20.0);
        sobj.enqueue(30.0);
        sobj.enqueue(40.0);
        sobj.enqueue(50.0);

        sobj.Display();

        iRet = sobj.Count();
        System.out.println("Number of elements in the queue are : "+iRet);

        dRet = sobj.dequeue();
        System.out.println("Removed element from queue is : "+dRet);

        dRet = sobj.dequeue();
        System.out.println("Removed element from queue is : "+dRet);
        
        dRet = sobj.dequeue();
        System.out.println("Removed element from queue is : "+dRet);
        
        sobj.Display();

        iRet = sobj.Count();
        System.out.println("Number of elements in the queue are : "+iRet);
    }
}
