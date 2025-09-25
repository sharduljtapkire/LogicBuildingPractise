/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program501.java
//
//  Description : Binary Search Tree with insertion, inorder, preorder, postorder,
//                search (with time complexity), total node count, and leaf node count.
//
//  Author      : Shardul Tapkire
//  Date        : 25/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Node
{
    int data;
    Node lchild;
    Node rchild;

    Node(int value)
    {
        data = value;
        lchild = null;
        rchild = null;
    }
}

class BinarySearchTree
{
    private Node root;
    private int countStatic = 0;          // Mimic static variable in C Count
    private int leafCountStatic = 0;      // Mimic static variable in C CountLeafNodes

    public BinarySearchTree()
    {
        root = null;
    }

    public void insert(int no)
    {
        Node newn = new Node(no);

        if(root == null)
        {
            root = newn;
        }
        else
        {
            Node temp = root;

            while(true)
            {
                if(no == temp.data)
                {
                    System.out.println("Duplicate element : Unable to insert node");
                    break;
                }
                else if(no > temp.data)  // rchild
                {
                    if(temp.rchild == null)
                    {
                        temp.rchild = newn;
                        break;
                    }
                    temp = temp.rchild;
                }
                else  // no < temp.data, lchild
                {
                    if(temp.lchild == null)
                    {
                        temp.lchild = newn;
                        break;
                    }
                    temp = temp.lchild;
                }
            }
        }
    }

    public void inorder()
    {
        inorderHelper(root);
        System.out.println();
    }

    private void inorderHelper(Node node)
    {
        if(node != null)
        {
            inorderHelper(node.lchild);
            System.out.print(node.data + "\t");
            inorderHelper(node.rchild);
        }
    }

    public void preorder()
    {
        preorderHelper(root);
        System.out.println();
    }

    private void preorderHelper(Node node)
    {
        if(node != null)
        {
            System.out.print(node.data + "\t");
            preorderHelper(node.lchild);
            preorderHelper(node.rchild);
        }
    }

    public void postorder()
    {
        postorderHelper(root);
        System.out.println();
    }

    private void postorderHelper(Node node)
    {
        if(node != null)
        {
            postorderHelper(node.lchild);
            postorderHelper(node.rchild);
            System.out.print(node.data + "\t");
        }
    }

    public boolean search(int no)
    {
        Node temp = root;
        boolean bFlag = false;
        int timeComplexity = 0;

        while(temp != null)
        {
            if(no == temp.data)
            {
                bFlag = true;
                break;
            }
            else if(no > temp.data)
            {
                temp = temp.rchild;
            }
            else
            {
                temp = temp.lchild;
            }
            timeComplexity++;
        }

        System.out.println("Time complexity of search is : " + timeComplexity);
        return bFlag;
    }

    public int count()
    {
        countStatic = 0;   // Reset before recursion
        countHelper(root);
        return countStatic;
    }

    private void countHelper(Node node)
    {
        if(node != null)
        {
            countStatic++;
            countHelper(node.rchild);  // rchild first as in C code
            countHelper(node.lchild);
        }
    }

    public int countLeafNodes()
    {
        leafCountStatic = 0;  // Reset before recursion
        countLeafHelper(root);
        return leafCountStatic;
    }

    private void countLeafHelper(Node node)
    {
        if(node != null)
        {
            if(node.lchild == null && node.rchild == null)
            {
                leafCountStatic++;
            }
            countLeafHelper(node.rchild);
            countLeafHelper(node.lchild);
        }
    }
}

public class Program501
{
    public static void main(String[] args)
    {
        BinarySearchTree bst = new BinarySearchTree();
        boolean bRet;
        int iRet;

        bst.insert(11);
        bst.insert(9);
        bst.insert(17);
        bst.insert(25);
        bst.insert(7);
        bst.insert(35);
        bst.insert(10);
        bst.insert(15);
        bst.insert(21);
        bst.insert(26);
        bst.insert(37);
        bst.insert(89);
        bst.insert(91);
        bst.insert(65);
        bst.insert(12);
        bst.insert(20);
        bst.insert(44);
        bst.insert(66);
        bst.insert(90);
        bst.insert(88);

        bRet = bst.search(66);
        if(bRet)
        {
            System.out.println("Element is present");
        }
        else
        {
            System.out.println("There is no such element");
        }

        iRet = bst.count();
        System.out.println("Number of nodes are : " + iRet);

        iRet = bst.countLeafNodes();
        System.out.println("Number of leaf nodes are : " + iRet);
    }
}
