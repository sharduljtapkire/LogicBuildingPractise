/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program297.java
//
//  Description : Interactive Doubly Linear Linked List in Java.
//                Implements InsertFirst, InsertLast, InsertAtPos, DeleteFirst,
//                DeleteLast, DeleteAtPos, Display, Count, and menu-driven interface.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Node
{
    public int data;
    public Node next;
    public Node prev;

    public Node(int value)
    {
        data = value;
        next = null;
        prev = null;
    }
}

class DoublyLL
{
    private Node head;

    public DoublyLL()
    {
        head = null;
    }

    public void Display()
    {
        System.out.print("NULL <=> ");
        Node temp = head;
        while(temp != null)
        {
            System.out.print("| " + temp.data + " | <=> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public int Count()
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

    public void InsertFirst(int no)
    {
        Node newn = new Node(no);

        if(head == null)
        {
            head = newn;
        }
        else
        {
            newn.next = head;
            head.prev = newn;
            head = newn;
        }
    }

    public void InsertLast(int no)
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
            newn.prev = temp;
            temp.next = newn;
        }
    }

    public void InsertAtPos(int no, int pos)
    {
        int iCount = Count();

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
            Node newn = new Node(no);
            Node temp = head;

            for(int i = 1; i < pos - 1; i++)
            {
                temp = temp.next;
            }

            newn.next = temp.next;
            newn.next.prev = newn;
            temp.next = newn;
            newn.prev = temp;
        }
    }

    public void DeleteFirst()
    {
        if(head == null)
        {
            return;
        }
        else if(head.next == null)
        {
            head = null;
        }
        else
        {
            head = head.next;
            head.prev = null;
        }
    }

    public void DeleteLast()
    {
        if(head == null)
        {
            return;
        }
        else if(head.next == null)
        {
            head = null;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.prev.next = null;
        }
    }

    public void DeleteAtPos(int pos)
    {
        int iCount = Count();

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
            Node temp = head;
            for(int i = 1; i < pos - 1; i++)
            {
                temp = temp.next;
            }

            Node target = temp.next;
            temp.next = target.next;
            target.next.prev = temp;
        }
    }
}

public class Program297
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        DoublyLL list = new DoublyLL();

        int iChoice = 0;
        int iValue = 0;
        int iPos = 0;

        System.out.println("-------------------------------------------------------------");
        System.out.println("---------------- Doubly Linear LinkedList -------------------");
        System.out.println("-------------------------------------------------------------\n");

        while(true)
        {
            System.out.println("-------------------------------------------------------------");
            System.out.println("------------------ Please select the option -----------------");
            System.out.println("-------------------------------------------------------------");
            System.out.println("1 : Insert new node at first position");
            System.out.println("2 : Insert new node at last position");
            System.out.println("3 : Insert new node at given position");
            System.out.println("4 : Delete the node from first position");
            System.out.println("5 : Delete the node from last position");
            System.out.println("6 : Delete the node from given position");
            System.out.println("7 : Display all elements of LinkedList");
            System.out.println("8 : Count number of nodes of LinkedList");
            System.out.println("0 : Terminate the application");
            System.out.println("-------------------------------------------------------------");

            iChoice = sc.nextInt();

            switch(iChoice)
            {
                case 1:
                    System.out.println("Enter the data that you want to insert : ");
                    iValue = sc.nextInt();
                    list.InsertFirst(iValue);
                    break;

                case 2:
                    System.out.println("Enter the data that you want to insert : ");
                    iValue = sc.nextInt();
                    list.InsertLast(iValue);
                    break;

                case 3:
                    System.out.println("Enter the data that you want to insert : ");
                    iValue = sc.nextInt();
                    System.out.println("Enter the position at which you want to insert new node : ");
                    iPos = sc.nextInt();
                    list.InsertAtPos(iValue, iPos);
                    break;

                case 4:
                    System.out.println("Deleting the first element from LinkedList");
                    list.DeleteFirst();
                    break;

                case 5:
                    System.out.println("Deleting the last element from LinkedList");
                    list.DeleteLast();
                    break;

                case 6:
                    System.out.println("Deleting the element from given position from LinkedList");
                    System.out.println("Enter the position from which you want to delete the node : ");
                    iPos = sc.nextInt();
                    list.DeleteAtPos(iPos);
                    break;

                case 7:
                    System.out.println("Elements of the LinkedList are : ");
                    list.Display();
                    break;

                case 8:
                    int count = list.Count();
                    System.out.println("Number of elements in the LinkedList are : " + count);
                    break;

                case 0:
                    System.out.println("Thank you for using our application");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("-------------------------------------------------------------");
        }
    }
}
