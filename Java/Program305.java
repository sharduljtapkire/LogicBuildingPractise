/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program305.java
//
//  Description : Singly Circular Linked List (SCLL) in Java
//                Implements InsertFirst, InsertLast, Display, Count,
//                DeleteFirst and DeleteLast
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

// Node class represents each element of the list
class Node {
    int data;
    Node next;

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Singly Circular Linked List implementation
class SinglyCLL {
    private Node first;
    private Node last;
    private int iCount;

    // Constructor
    public SinglyCLL() {
        System.out.println("Inside constructor of SinglyCLL");
        this.first = null;
        this.last = null;
        this.iCount = 0;
    }

    // Insert element at the beginning
    public void insertFirst(int no) {
        Node newn = new Node(no);

        if (first == null && last == null) {
            first = newn;
            last = newn;
            last.next = first;
        } else {
            newn.next = first;
            first = newn;
            last.next = first;
        }
        iCount++;
    }

    // Insert element at the end
    public void insertLast(int no) {
        Node newn = new Node(no);

        if (first == null && last == null) {
            first = newn;
            last = newn;
            last.next = first;
        } else {
            last.next = newn;
            last = newn;
            last.next = first;
        }
        iCount++;
    }

    // Delete element from the beginning
    public void deleteFirst() {
        if (first == null && last == null) {
            return;
        } else if (first == last) {
            first = null;
            last = null;
        } else {
            first = first.next;
            last.next = first;
        }
        iCount--;
    }

    // Delete element from the end
    public void deleteLast() {
        if (first == null && last == null) {
            return;
        } else if (first == last) {
            first = null;
            last = null;
        } else {
            Node temp = first;
            while (temp.next != last) {
                temp = temp.next;
            }
            last = temp;
            last.next = first;
        }
        iCount--;
    }

    // Display the elements of the list
    public void display() {
        if (first == null && last == null) {
            return;
        }

        Node temp = first;
        do {
            System.out.print("| " + temp.data + " | -> ");
            temp = temp.next;
        } while (temp != first);

        System.out.println();
    }

    // Return number of elements in the list
    public int count() {
        return iCount;
    }
}

// Main class with driver code
public class Program305 {
    public static void main(String[] args) {
        SinglyCLL sobj = new SinglyCLL();

        sobj.insertFirst(51);
        sobj.insertFirst(21);
        sobj.insertFirst(11);

        sobj.insertLast(101);
        sobj.insertLast(111);
        sobj.insertLast(121);

        sobj.display();
        System.out.println("Number of elements are : " + sobj.count());

        sobj.deleteFirst();
        sobj.display();
        System.out.println("Number of elements are : " + sobj.count());

        sobj.deleteLast();
        sobj.display();
        System.out.println("Number of elements are : " + sobj.count());
    }
}
