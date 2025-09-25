/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program494.java
//
//  Description : Singly Linked List with insertion, deletion, iterative display,
//                tail-recursive display, head-recursive display, iterative and 
//                recursive counting.
//
//  Author      : Shardul Tapkire
//  Date        : 25/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Node
{
    int data;
    Node next;

    Node(int value)
    {
        data = value;
        next = null;
    }
}

class SinglyLinkedList
{
    private Node head;
    private int recursiveCount;  // to simulate static variable in CountR

    public SinglyLinkedList()
    {
        head = null;
        recursiveCount = 0;
    }

    public void insertFirst(int no)
    {
        Node newn = new Node(no);
        newn.next = head;
        head = newn;
    }

    public void insertLast(int no)
    {
        Node newn = new Node(no);

        if(head == null)
        {
            head = newn;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
        }
    }

    public void displayIterative()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print("| " + temp.data + " | -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void displayTailRecursive()
    {
        displayTailRecursiveHelper(head);
        System.out.println("NULL");
    }

    private void displayTailRecursiveHelper(Node node)
    {
        if(node != null)
        {
            System.out.print("| " + node.data + " | -> ");
            displayTailRecursiveHelper(node.next);
        }
    }

    public void displayHeadRecursive()
    {
        displayHeadRecursiveHelper(head);
        System.out.println("NULL");
    }

    private void displayHeadRecursiveHelper(Node node)
    {
        if(node != null)
        {
            displayHeadRecursiveHelper(node.next);
            System.out.print("| " + node.data + " | -> ");
        }
    }

    public int countIterative()
    {
        int iCount = 0;
        Node temp = head;
        while(temp != null)
        {
            iCount++;
            temp = temp.next;
        }
        return iCount;
    }

    public int countRecursive()
    {
        recursiveCount = 0;  // reset before recursion
        return countRecursiveHelper(head);
    }

    private int countRecursiveHelper(Node node)
    {
        if(node != null)
        {
            recursiveCount++;
            countRecursiveHelper(node.next);
        }
        return recursiveCount;
    }

    public void deleteFirst()
    {
        if(head == null) return;
        else if(head.next == null) head = null;
        else head = head.next;
    }

    public void deleteLast()
    {
        if(head == null) return;
        else if(head.next == null) head = null;
        else
        {
            Node temp = head;
            while(temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void insertAtPos(int no, int pos)
    {
        int iCount = countIterative();

        if(pos < 1 || pos > iCount + 1)
        {
            System.out.println("Invalid position");
            return;
        }

        if(pos == 1) insertFirst(no);
        else if(pos == iCount + 1) insertLast(no);
        else
        {
            Node temp = head;
            for(int i = 1; i <= pos - 2; i++)
            {
                temp = temp.next;
            }
            Node newn = new Node(no);
            newn.next = temp.next;
            temp.next = newn;
        }
    }

    public void deleteAtPos(int pos)
    {
        int iCount = countIterative();

        if(pos < 1 || pos > iCount)
        {
            System.out.println("Invalid position");
            return;
        }

        if(pos == 1) deleteFirst();
        else if(pos == iCount) deleteLast();
        else
        {
            Node temp = head;
            for(int i = 1; i <= pos - 2; i++)
            {
                temp = temp.next;
            }
            Node target = temp.next;
            temp.next = target.next;
        }
    }
}

public class Program494
{
    public static void main(String[] args)
    {
        SinglyLinkedList list = new SinglyLinkedList();

        int iRet;

        list.insertFirst(51);
        list.insertFirst(21);
        list.insertFirst(11);

        // Head-recursive display
        list.displayHeadRecursive();

        // Recursive count
        iRet = list.countRecursive();

        System.out.println("Number of elements are : " + iRet);
    }
}
