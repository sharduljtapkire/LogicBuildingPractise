/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program642.java
//  Description : Generic Singly Circular Linked List implementation in Java
//                Supports InsertFirst, InsertLast, InsertAtPos, DeleteFirst,
//                DeleteLast, DeleteAtPos, Display, and Count operations.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////
//
//  Class :         SinglyCLLNode
//  Description :   Generic node for Singly Circular Linked List
//
///////////////////////////////////////////////////////////////////////
class SinglyCLLNode<T>
{
    public T data;
    public SinglyCLLNode<T> next;

    public SinglyCLLNode(T value)
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
    private SinglyCLLNode<T> first;
    private SinglyCLLNode<T> last;
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
        SinglyCLLNode<T> newn = new SinglyCLLNode<T>(no);

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
        SinglyCLLNode<T> newn = new SinglyCLLNode<T>(no);

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
            SinglyCLLNode<T> temp = first;
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

        SinglyCLLNode<T> temp = first;

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
            SinglyCLLNode<T> temp = first;

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
            SinglyCLLNode<T> newn = new SinglyCLLNode<T>(no);
            SinglyCLLNode<T> temp = first;

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
//  Class :         Program642
//  Description :   Empty main for testing
//
///////////////////////////////////////////////////////////////////////
public class Program642
{
    public static void main(String[] args)
    {
        // Testing can be done here if required
    }
}
