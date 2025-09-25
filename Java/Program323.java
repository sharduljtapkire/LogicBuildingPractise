/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program323.java
//
//  Description : Singly Circular Linked List (SCLL) in Java
//                Implements InsertFirst, InsertLast, DeleteFirst, Display, Count
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyCLL {
    private Node first;
    private Node last;

    public SinglyCLL() {
        first = null;
        last = null;
    }

    // Insert node at the beginning
    public void insertFirst(int no) {
        Node newn = new Node(no);

        if(first == null && last == null) {
            first = last = newn;
            last.next = first; // circular link
        } else {
            newn.next = first;
            first = newn;
            last.next = first;
        }
    }

    // Insert node at the end
    public void insertLast(int no) {
        Node newn = new Node(no);

        if(first == null && last == null) {
            first = last = newn;
            last.next = first; // circular link
        } else {
            last.next = newn;
            last = newn;
            last.next = first;
        }
    }

    // Delete first node
    public void deleteFirst() {
        if(first == null && last == null) {
            return; // empty list
        } else if(first == last) { // only one node
            first = last = null;
        } else {
            first = first.next;
            last.next = first;
        }
    }

    // Display all nodes
    public void display() {
        if(first == null && last == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        Node temp = first;
        do {
            System.out.print("| " + temp.data + " | -> ");
            temp = temp.next;
        } while(temp != first);
        System.out.println();
    }

    // Count number of nodes
    public int count() {
        int iCount = 0;

        if(first == null && last == null) {
            return iCount;
        }

        Node temp = first;
        do {
            iCount++;
            temp = temp.next;
        } while(temp != first);

        return iCount;
    }
}

public class Program323 {
    public static void main(String[] args) {
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

        list.deleteFirst();

        System.out.println("Linked List after deleting first element:");
        list.display();

        iRet = list.count();
        System.out.println("Number of elements are : " + iRet);
    }
}
