/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program340.java
//
//  Description : Generic Stack implementation using Singly Linked List in Java
//                Supports any data type (Integer, Double, Character, etc.).
//                Implements push (InsertFirst), pop (DeleteFirst),
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
        this.first = null;
        this.iCount = 0;
    }

    public void push(T no)    // InsertFirst
    {
        Node<T> newn = new Node<T>();

        newn.data = no;
        newn.next = null;

        newn.next = first;
        first = newn;

        iCount++;
    }

    public T pop()           // DeleteFirst
    {
        Node<T> temp = first;
    
        if(this.first == null)  // Stack empty
        {
            System.out.println("Unable to pop as stack is empty");
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
            System.out.println("| "+temp.data+" |");
            temp = temp.next;
        }
    }

    public int Count()
    {
        return iCount;
    }
}

class Program340
{
    public static void main(String[] args)
    {
        StackX<Integer> sobj = new StackX<>();
        int iRet = 0;

        sobj.push(10);
        sobj.push(20);
        sobj.push(30);
        sobj.push(40);
        sobj.push(50);

        sobj.Display();

        iRet = sobj.Count();
        System.out.println("Number of elements in the stack are : "+iRet);

        iRet = sobj.pop();
        System.out.println("Poped element from stack is : "+iRet);

        iRet = sobj.pop();
        System.out.println("Poped element from stack is : "+iRet);
        
        iRet = sobj.pop();
        System.out.println("Poped element from stack is : "+iRet);
        
        sobj.Display();

        iRet = sobj.Count();
        System.out.println("Number of elements in the stack are : "+iRet);
    }
}
