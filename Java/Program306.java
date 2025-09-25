/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program306.java
//
//  Description : Singly Circular Linked List (SCLL) in Java
//                Implements InsertFirst, InsertLast, InsertAtPos, DeleteFirst,
//                DeleteLast, DeleteAtPos (partial), Display, Count
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
    private int iCount;

    public SinglyCLL() {
        System.out.println("Inside constructor of SinglyCLL");
        this.first = null;
        this.last = null;
        this.iCount = 0;
    }

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

    public void insertAtPos(int no, int pos) {
        if (pos < 1 || pos > iCount + 1) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            insertFirst(no);
        } else if (pos == iCount + 1) {
            insertLast(no);
        } else {
            Node newn = new Node(no);
            Node temp = first;

            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }

            newn.next = temp.next;
            temp.next = newn;
            iCount++;
        }
    }

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

    public void deleteAtPos(int pos) {
        if (pos < 1 || pos > iCount) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            deleteFirst();
        } else if (pos == iCount) {
            deleteLast();
        } else {
            Node temp = first;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            iCount--;
        }
    }

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

    public int count() {
        return iCount;
    }
}

public class Program306 {
    public static void main(String[] args) {
        SinglyCLL sobj = new SinglyCLL();

        sobj.insertFirst(51);
        sobj.insertFirst(21);
        sobj.insertFirst(11);

        sobj.insertLast(101);
        sobj.insertLast(111);
        sobj.insertLast(121);

        sobj.insertAtPos(105, 5);

        sobj.display();
        System.out.println("Number of elements are : " + sobj.count());

        sobj.deleteFirst();
        sobj.display();
        System.out.println("Number of elements are : " + sobj.count());

        sobj.deleteLast();
        sobj.display();
        System.out.println("Number of elements are : " + sobj.count());

        sobj.deleteAtPos(3);
        sobj.display();
        System.out.println("Number of elements are : " + sobj.count());
    }
}
