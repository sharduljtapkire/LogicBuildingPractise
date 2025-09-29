/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program648.java
//  Description : Generic Singly Linear Linked List implementation in Java
//                Supports operations: add first, add last, insert at position,
//                delete first, delete last, delete at position, reverse, search.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//
//  Generic Node class for Singly Linked List
//
/////////////////////////////////////////////////////////////////////////////
class GEN_LIST<T>
{
    T Data;
    GEN_LIST<T> pNext;
}

/////////////////////////////////////////////////////////////////////////////
//
//  Singly Linear Linked List class
//
/////////////////////////////////////////////////////////////////////////////
class Singly_linkedList<T>
{
    GEN_LIST<T> pHead;
    GEN_LIST<T> pTail;

    Singly_linkedList()
    {
        pHead = null;
        pTail = null;
    }

    boolean AddToGenListFirst(T pNodeData)
    {
        if (pNodeData == null)
        {
            return false;
        }

        GEN_LIST<T> pNewNode = new GEN_LIST<>();
        pNewNode.Data = pNodeData;
        pNewNode.pNext = null;

        if (pHead == null)
        {
            pHead = pNewNode;
            pTail = pNewNode;
        }
        else
        {
            pNewNode.pNext = pHead;
            pHead = pNewNode;
        }

        return true;
    }

    boolean AddToGenListLast(T pNodeData)
    {
        if (pNodeData == null)
        {
            return false;
        }

        GEN_LIST<T> pNewNode = new GEN_LIST<>();
        pNewNode.Data = pNodeData;
        pNewNode.pNext = null;

        if (pHead == null)
        {
            pHead = pNewNode;
            pTail = pNewNode;
        }
        else
        {
            pTail.pNext = pNewNode;
            pTail = pNewNode;
        }

        return true;
    }

    void DisplayGenList()
    {
        GEN_LIST<T> pTempNode = pHead;
        while (pTempNode != null)
        {
            System.out.print(pTempNode.Data + " -> ");
            pTempNode = pTempNode.pNext;
        }
    }

    int CountGenListNode()
    {
        int CountNode = 0;
        GEN_LIST<T> pListHead = pHead;

        while (pListHead != null)
        {
            CountNode++;
            pListHead = pListHead.pNext;
        }
        return CountNode;
    }

    int SearchFirstOccurance(T data)
    {
        int CountNode = 0;
        GEN_LIST<T> pListHead = pHead;

        while (pListHead != null)
        {
            CountNode++;
            if (pListHead.Data.equals(data))
            {
                return CountNode;
            }
            pListHead = pListHead.pNext;
        }

        return -1;
    }

    int SearchAllOccurance(T data)
    {
        int CountNode = 0;
        GEN_LIST<T> pListHead = pHead;

        while (pListHead != null)
        {
            if (pListHead.Data.equals(data))
            {
                CountNode++;
            }
            pListHead = pListHead.pNext;
        }

        return CountNode;
    }

    boolean InsertAtPosition(int pos, T pNodeData)
    {
        if (pHead == null)
        {
            return false;
        }
        else if (pos == 1)
        {
            AddToGenListFirst(pNodeData);
        }
        else if (pos == CountGenListNode() + 1)
        {
            AddToGenListLast(pNodeData);
        }
        else if (pos > CountGenListNode())
        {
            return false;
        }
        else
        {
            int i = 1;
            GEN_LIST<T> temp = pHead;
            GEN_LIST<T> pNewNode = new GEN_LIST<>();
            pNewNode.Data = pNodeData;
            pNewNode.pNext = null;

            while (i < pos - 1)
            {
                temp = temp.pNext;
                i++;
            }
            pNewNode.pNext = temp.pNext;
            temp.pNext = pNewNode;
        }

        return true;
    }

    boolean DeleteFromGenListFirst()
    {
        if (pHead == null)
        {
            return false;
        }

        pHead = pHead.pNext;
        return true;
    }

    boolean DeleteFromGenListLast()
    {
        if (pHead == null)
        {
            return false;
        }

        if (pHead.pNext == null)
        {
            pHead = null;
            pTail = null;
            return true;
        }

        GEN_LIST<T> temp = pHead;
        while (temp.pNext.pNext != null)
        {
            temp = temp.pNext;
        }
        temp.pNext = null;
        pTail = temp;

        return true;
    }

    boolean DeleteAtPosition(int pos)
    {
        if (pos > CountGenListNode())
        {
            return false;
        }
        else if (pos == 1)
        {
            DeleteFromGenListFirst();
        }
        else if (pos == CountGenListNode())
        {
            DeleteFromGenListLast();
        }
        else
        {
            int i = 1;
            GEN_LIST<T> temp = pHead;
            GEN_LIST<T> t = null;

            while (i < pos)
            {
                t = temp;
                temp = temp.pNext;
                i++;
            }
            t.pNext = temp.pNext;
        }

        return true;
    }

    boolean ReverseList()
    {
        if (pHead == null)
        {
            return false;
        }

        GEN_LIST<T> prev = null;
        GEN_LIST<T> current = pHead;
        GEN_LIST<T> next = null;

        while (current != null)
        {
            next = current.pNext;
            current.pNext = prev;
            prev = current;
            current = next;
        }
        pHead = prev;
        return true;
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Entry point function
//
/////////////////////////////////////////////////////////////////////////////
public class Program648
{
    public static void main(String[] args)
    {
        Singly_linkedList<Integer> sobj = new Singly_linkedList<>();
        int no = 10;

        sobj.AddToGenListFirst(no++);
        sobj.AddToGenListFirst(no++);
        sobj.AddToGenListFirst(no++);
        sobj.AddToGenListFirst(no);

        no = 25;
        sobj.AddToGenListLast(no);

        sobj.DisplayGenList();
        System.out.println();

        no = 11;
        System.out.println("Element 11 is found at position " + sobj.SearchFirstOccurance(no));

        sobj.InsertAtPosition(4, no);
        sobj.DisplayGenList();
        System.out.println();

        sobj.DeleteFromGenListFirst();
        sobj.DisplayGenList();
        System.out.println();

        sobj.DeleteFromGenListLast();
        sobj.DisplayGenList();
        System.out.println();

        sobj.DeleteAtPosition(2);
        sobj.DisplayGenList();
        System.out.println();

        sobj.ReverseList();
        sobj.DisplayGenList();
        System.out.println();
    }
}
