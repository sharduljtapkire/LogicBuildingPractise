/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program645.java
//  Description : Generic implementation of Doubly Circular Linked List
//                Supports InsertFirst, InsertLast, InsertAtPos,
//                         DeleteFirst, DeleteLast, DeleteAtPos,
//                         Display, Count
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

class DoublyCLL<T>
{
    private class DoublyCLLNode
    {
        T data;
        DoublyCLLNode next;
        DoublyCLLNode prev;

        DoublyCLLNode(T value)
        {
            data = value;
            next = null;
            prev = null;
        }
    }

    private DoublyCLLNode first;
    private DoublyCLLNode last;
    private int iCount;

    public DoublyCLL()
    {
        System.out.println("Inside Constructor");
        first = null;
        last = null;
        iCount = 0;
    }

    public void InsertFirst(T no)
    {
        DoublyCLLNode newn = new DoublyCLLNode(no);

        if(first == null && last == null)
        {
            first = newn;
            last = newn;
        }
        else
        {
            newn.next = first;
            first.prev = newn;
            first = newn;
        }

        last.next = first;
        first.prev = last;

        iCount++;
    }

    public void InsertLast(T no)
    {
        DoublyCLLNode newn = new DoublyCLLNode(no);

        if(first == null && last == null)
        {
            first = newn;
            last = newn;
        }
        else
        {
            last.next = newn;
            newn.prev = last;
            last = newn;
        }

        last.next = first;
        first.prev = last;

        iCount++;
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
            DoublyCLLNode newn = new DoublyCLLNode(no);
            DoublyCLLNode temp = first;

            for(int i = 1; i < pos - 1; i++)
            {
                temp = temp.next;
            }

            newn.next = temp.next;
            temp.next.prev = newn;

            temp.next = newn;
            newn.prev = temp;

            iCount++;
        }
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
            first.prev = last;
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
            last = last.prev;
            last.next = first;
            first.prev = last;
        }

        iCount--;
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
            DoublyCLLNode temp = first;

            for(int i = 1; i < pos - 1; i++)
            {
                temp = temp.next;
            }

            DoublyCLLNode target = temp.next;

            temp.next = target.next;
            target.next.prev = temp;

            iCount--;
        }
    }

    public void Display()
    {
        if(first == null && last == null)
        {
            System.out.println("LinkedList is empty");
            return;
        }

        DoublyCLLNode temp = first;

        System.out.println("Elements of the LinkedList are : ");

        do
        {
            System.out.print("| " + temp.data + " | <=> ");
            temp = temp.next;
        } while(temp != first);

        System.out.println();
    }

    public int Count()
    {
        return iCount;
    }
}

public class Program645
{
    public static void main(String[] args)
    {
        DoublyCLL<Integer> dobj = new DoublyCLL<>();
        int iRet = 0;

        dobj.InsertFirst(51);
        dobj.InsertFirst(21);
        dobj.InsertFirst(11);

        dobj.InsertLast(101);
        dobj.InsertLast(111);
        dobj.InsertLast(121);

        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number of elements are : " + iRet);

        dobj.InsertAtPos(105, 5);

        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number of elements are : " + iRet);

        dobj.DeleteAtPos(5);

        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number of elements are : " + iRet);
    }
}
