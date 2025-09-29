/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program640.java
//  Description : Generic implementation of Singly Circular Linked List
//                Supports InsertFirst, InsertLast, InsertAtPos, DeleteFirst,
//                DeleteLast, DeleteAtPos, Display, and Count operations.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////
//
//  Class :         Node
//  Description :   Generic node structure for Singly Circular Linked List
//
///////////////////////////////////////////////////////////////////////
class Node<T>
{
    public T data;
    public Node<T> next;

    public Node(T value)
    {
        data = value;
        next = null;
    }
}

///////////////////////////////////////////////////////////////////////
//
//  Class :         SinglyCLL
//  Description :   Generic Singly Circular Linked List
//
///////////////////////////////////////////////////////////////////////
class SinglyCLL<T>
{
    private Node<T> first;
    private Node<T> last;
    private int iCount;

    public SinglyCLL()
    {
        System.out.println("Inside constructor of SinglyCLL");
        first = null;
        last = null;
        iCount = 0;
    }

    public void InsertFirst(T no)
    {
        Node<T> newn = new Node<T>(no);

        if(first == null && last == null)
        {
            first = newn;
            last = newn;
            last.next = first;
        }
        else
        {
            newn.next = first;
            first = newn;
            last.next = first;
        }
        iCount++;
    }

    public void InsertLast(T no)
    {
        Node<T> newn = new Node<T>(no);

        if(first == null && last == null)
        {
            first = newn;
            last = newn;
            last.next = first;
        }
        else
        {
            last.next = newn;
            last = newn;
            last.next = first;
        }
        iCount++;
    }

    public void DeleteFirst()
    {
        if(first == null && last == null)
        {
            return;
        }
        else if(first == last)
        {
            first = null;
            last = null;
        }
        else
        {
            first = first.next;
            last.next = first;
        }
        iCount--;
    }

    public void DeleteLast()
    {
        if(first == null && last == null)
        {
            return;
        }
        else if(first == last)
        {
            first = null;
            last = null;
        }
        else
        {
            Node<T> temp = first;
            while(temp.next != last)
            {
                temp = temp.next;
            }
            last = temp;
            last.next = first;
        }
        iCount--;
    }

    public void Display()
    {
        if(first == null && last == null)
        {
            return;
        }

        Node<T> temp = first;
        do
        {
            System.out.print("| " + temp.data + " | -> ");
            temp = temp.next;
        } while(temp != last.next);

        System.out.println();
    }

    public int Count()
    {
        return iCount;
    }

    public void DeleteAtPos(int pos)
    {
        if(pos < 1 || pos > iCount)
        {
            System.out.println("Invalid position");
            return;
        }

        if(pos == 1)
        {
            DeleteFirst();
        }
        else if(pos == iCount)
        {
            DeleteLast();
        }
        else
        {
            Node<T> temp = first;
            for(int i = 1; i < pos - 1; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            iCount--;
        }
    }

    public void InsertAtPos(T no, int pos)
    {
        if(pos < 1 || pos > iCount + 1)
        {
            System.out.println("Invalid position");
            return;
        }

        if(pos == 1)
        {
            InsertFirst(no);
        }
        else if(pos == iCount + 1)
        {
            InsertLast(no);
        }
        else
        {
            Node<T> newn = new Node<T>(no);
            Node<T> temp = first;
            for(int i = 1; i < pos - 1; i++)
            {
                temp = temp.next;
            }
            newn.next = temp.next;
            temp.next = newn;
            iCount++;
        }
    }
}

///////////////////////////////////////////////////////////////////////
//
//  Class :         Program640
//  Description :   Demonstrates Generic Singly Circular Linked List
//
///////////////////////////////////////////////////////////////////////
public class Program640
{
    public static void main(String[] args)
    {
        SinglyCLL<Integer> sobj = new SinglyCLL<>();
        int iRet = 0;

        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);

        sobj.InsertLast(101);
        sobj.InsertLast(111);
        sobj.InsertLast(121);

        sobj.InsertAtPos(105, 5);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of elements are : " + iRet);

        sobj.DeleteAtPos(5);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of elements are : " + iRet);

        sobj.DeleteFirst();

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of elements are : " + iRet);

        sobj.DeleteLast();

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of elements are : " + iRet);
    }
}
