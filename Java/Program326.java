/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program326.java
//
//  Description : Singly Circular Linked List (SCLL) in Java
//                Implements InsertFirst, InsertLast, InsertAtPos,
//                DeleteFirst, DeleteLast, DeleteAtPos, Display, Count
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class SinglyCLL
{
    private Node first;
    private Node last;

    public SinglyCLL()
    {
        first = null;
        last = null;
    }

    public int count()
    {
        int iCount = 0;

        if(first == null && last == null)
        {
            return iCount;
        }

        Node temp = first;
        do
        {
            iCount++;
            temp = temp.next;
        } while(temp != first);

        return iCount;
    }

    public void insertFirst(int no)
    {
        Node newn = new Node(no);

        if(first == null && last == null)
        {
            first = last = newn;
            last.next = first;
        }
        else
        {
            newn.next = first;
            first = newn;
            last.next = first;
        }
    }

    public void insertLast(int no)
    {
        Node newn = new Node(no);

        if(first == null && last == null)
        {
            first = last = newn;
            last.next = first;
        }
        else
        {
            last.next = newn;
            last = newn;
            last.next = first;
        }
    }

    public void insertAtPos(int no, int pos)
    {
        int iCount = count();

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
            temp.next = newn;
        }
    }

    public void deleteFirst()
    {
        if(first == null && last == null)
        {
            return;
        }
        else if(first == last)
        {
            first = last = null;
        }
        else
        {
            first = first.next;
            last.next = first;
        }
    }

    public void deleteLast()
    {
        if(first == null && last == null)
        {
            return;
        }
        else if(first == last)
        {
            first = last = null;
        }
        else
        {
            Node temp = first;
            while(temp.next != last)
            {
                temp = temp.next;
            }
            last = temp;
            last.next = first;
        }
    }

    public void deleteAtPos(int pos)
    {
        int iCount = count();

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
            temp.next = temp.next.next;
        }
    }

    public void display()
    {
        if(first == null && last == null)
        {
            System.out.println("LinkedList is empty");
            return;
        }

        Node temp = first;
        do
        {
            System.out.print("| " + temp.data + " | -> ");
            temp = temp.next;
        } while(temp != first);
        System.out.println();
    }
}

public class Program326
{
    public static void main(String[] args)
    {
        SinglyCLL list = new SinglyCLL();
        int iRet;

        list.insertFirst(51);
        list.insertFirst(21);
        list.insertFirst(11);

        list.insertLast(101);
        list.insertLast(111);
        list.insertLast(121);

        System.out.println("Linked List after insertion:");
        list.display();

        iRet = list.count();
        System.out.println("Number of elements are : " + iRet);

        list.insertAtPos(105, 5);
        System.out.println("Linked List after inserting 105 at position 5:");
        list.display();

        iRet = list.count();
        System.out.println("Number of elements are : " + iRet);

        list.deleteAtPos(5);
        System.out.println("Linked List after deleting element at position 5:");
        list.display();

        iRet = list.count();
        System.out.println("Number of elements are : " + iRet);
    }
}
