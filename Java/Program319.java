/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program319.java
//
//  Description : Doubly Circular Linked List (DCLL) in Java
//                Implements InsertFirst, InsertLast, InsertAtPos, DeleteFirst, DeleteLast, DeleteAtPos, Display, Count
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Node
{
    int data;
    Node next;
    Node prev;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyCLL
{
    private Node first;
    private Node last;
    private int iCount;

    public DoublyCLL()
    {
        System.out.println("Inside Constructor");
        this.first = null;
        this.last = null;
        this.iCount = 0;
    }

    public void insertFirst(int no)
    {
        Node newn = new Node(no);

        if(first == null && last == null)
        {
            first = last = newn;
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

    public void insertLast(int no)
    {
        Node newn = new Node(no);

        if(first == null && last == null)
        {
            first = last = newn;
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

    public void insertAtPos(int no, int pos)
    {
        if(pos < 1 || pos > iCount + 1)
        {
            System.out.println("Invalid position");
            return;
        }

        if(pos == 1)
        {
            insertFirst(no);
        }
        else if(pos == iCount + 1)
        {
            insertLast(no);
        }
        else
        {
            Node newn = new Node(no);
            Node temp = first;

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

    public void deleteFirst()
    {
        if(first == null && last == null)
            return;
        else if(first == last)
        {
            first = last = null;
        }
        else
        {
            first = first.next;
            first.prev = last;
            last.next = first;
        }

        iCount--;
    }

    public void deleteLast()
    {
        if(first == null && last == null)
            return;
        else if(first == last)
        {
            first = last = null;
        }
        else
        {
            last = last.prev;
            last.next = first;
            first.prev = last;
        }

        iCount--;
    }

    public void deleteAtPos(int pos)
    {
        if(pos < 1 || pos > iCount)
        {
            System.out.println("Invalid position");
            return;
        }

        if(pos == 1)
        {
            deleteFirst();
        }
        else if(pos == iCount)
        {
            deleteLast();
        }
        else
        {
            Node temp = first;
            for(int i = 1; i < pos - 1; i++)
            {
                temp = temp.next;
            }

            Node toDelete = temp.next;
            temp.next = toDelete.next;
            toDelete.next.prev = temp;

            // Help GC
            toDelete.next = null;
            toDelete.prev = null;

            iCount--;
        }
    }

    public void display()
    {
        if(first == null && last == null)
        {
            System.out.println("LinkedList is empty");
            return;
        }

        System.out.println("Elements of the LinkedList are : ");
        Node temp = first;

        do
        {
            System.out.print("| " + temp.data + " | <=> ");
            temp = temp.next;
        } while(temp != first);

        System.out.println();
    }

    public int count()
    {
        return iCount;
    }
}

public class Program319
{
    public static void main(String[] args)
    {
        DoublyCLL dobj = new DoublyCLL();
        int iRet = 0;

        dobj.insertFirst(51);
        dobj.insertFirst(21);
        dobj.insertFirst(11);

        dobj.insertLast(101);
        dobj.insertLast(111);
        dobj.insertLast(121);

        dobj.display();
        iRet = dobj.count();
        System.out.println("Number of elements are : " + iRet);

        dobj.insertAtPos(105, 5);
        dobj.display();
        iRet = dobj.count();
        System.out.println("Number of elements are : " + iRet);

        dobj.deleteAtPos(3);
        dobj.display();
        iRet = dobj.count();
        System.out.println("Number of elements are : " + iRet);
    }
}
