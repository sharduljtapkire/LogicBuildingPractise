/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program497.java
//
//  Description : Binary Search Tree with insertion, inorder, preorder, 
//                postorder traversals and search operation.
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

    public BinarySearchTree()
    {
        root = null;
    }

    public void insert(int no)
    {
        Node newn = new Node(no);

        if(root == null)  // BST is empty
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

        while(temp != null)
        {
            if(no == temp.data)
            {
                return true;
            }
            else if(no > temp.data)
            {
                temp = temp.rchild;
            }
            else
            {
                temp = temp.lchild;
            }
        }

        return false;
    }
}

public class Program497
{
    public static void main(String[] args)
    {
        BinarySearchTree bst = new BinarySearchTree();
        boolean bRet;

        bst.insert(11);
        bst.insert(9);
        bst.insert(17);
        bst.insert(25);
        bst.insert(7);
        bst.insert(35);
        bst.insert(10);
        bst.insert(15);
        bst.insert(21);

        bRet = bst.search(36);

        if(bRet)
        {
            System.out.println("Element is present");
        }
        else
        {
            System.out.println("There is no such element");
        }
    }
}
