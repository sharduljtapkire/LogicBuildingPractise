/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program643.java
//  Description : Generic implementations of Queue, Stack, and Singly Circular Linked List
//                Queue   : Enqueue, Dequeue, Display, Count
//                Stack   : Push, Pop, Display, Count
//                SinglyCLL: InsertFirst, InsertLast, InsertAtPos, DeleteFirst,
//                           DeleteLast, DeleteAtPos, Display, Count
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////
//
//  Class : QueueX
//  Description : Generic implementation of Queue
//
///////////////////////////////////////////////////////////////////////
class QueueX<T>
{
    private class QueueNode<T>
    {
        T data;
        QueueNode<T> next;

        QueueNode(T value)
        {
            data = value;
            next = null;
        }
    }

    private QueueNode<T> first;
    private int iCount;

    public QueueX()
    {
        first = null;
        iCount = 0;
    }

    public void Enqueue(T no) // InsertLast
    {
        QueueNode<T> newn = new QueueNode<T>(no);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            QueueNode<T> temp = first;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
        }
        iCount++;
    }

    public T Dequeue() // DeleteFirst
    {
        if(first == null)
        {
            System.out.println("Unable to remove as queue is empty");
            return null;
        }
        else
        {
            T value = first.data;
            first = first.next;
            iCount--;
            return value;
        }
    }

    public void Display()
    {
        QueueNode<T> temp = first;

        while(temp != null)
        {
            System.out.print("| " + temp.data + " |-");
            temp = temp.next;
        }
        System.out.println();
    }

    public int Count()
    {
        return iCount;
    }
}

///////////////////////////////////////////////////////////////////////
//
//  Class : StackX
//  Description : Generic implementation of Stack
//
///////////////////////////////////////////////////////////////////////
class StackX<T>
{
    private class StackNode<T>
    {
        T data;
        StackNode<T> next;

        StackNode(T value)
        {
            data = value;
            next = null;
        }
    }

    private StackNode<T> first;
    private int iCount;

    public StackX()
    {
        first = null;
        iCount = 0;
    }

    public void Push(T no) // InsertFirst
    {
        StackNode<T> newn = new StackNode<T>(no);
        newn.next = first;
        first = newn;
        iCount++;
    }

    public T Pop() // DeleteFirst
    {
        if(first == null)
        {
            System.out.println("Unable to pop as stack is empty");
            return null;
        }
        else
        {
            T value = first.data;
            first = first.next;
            iCount--;
            return value;
        }
    }

    public void Display()
    {
        StackNode<T> temp = first;

        while(temp != null)
        {
            System.out.print("| " + temp.data + " |-");
            temp = temp.next;
        }
        System.out.println();
    }

    public int Count()
    {
        return iCount;
    }
}

///////////////////////////////////////////////////////////////////////
//
//  Class : SinglyCLL
//  Description : Generic implementation of Singly Circular Linked List
//
///////////////////////////////////////////////////////////////////////
class SinglyCLL<T>
{
    private class SinglyCLLNode<T>
    {
        T data;
        SinglyCLLNode<T> next;

        SinglyCLLNode(T value)
        {
            data = value;
            next = null;
        }
    }

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
//  Class : Program643
//  Description : Main class to run code
//
///////////////////////////////////////////////////////////////////////
public class Program643
{
    public static void main(String[] args)
    {
        // Test Queue
        QueueX<Integer> queue = new QueueX<Integer>();
        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Enqueue(30);
        queue.Display();
        System.out.println("Dequeued: " + queue.Dequeue());
        queue.Display();

        // Test Stack
        StackX<Integer> stack = new StackX<Integer>();
        stack.Push(100);
        stack.Push(200);
        stack.Push(300);
        stack.Display();
        System.out.println("Popped: " + stack.Pop());
        stack.Display();

        // Test Singly Circular Linked List
        SinglyCLL<Integer> cll = new SinglyCLL<Integer>();
        cll.InsertFirst(1);
        cll.InsertLast(2);
        cll.InsertAtPos(3, 2);
        cll.Display();
        cll.DeleteAtPos(2);
        cll.Display();
    }
}
