/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program495.java
//
//  Description : Binary Search Tree with insertion and inorder traversal.
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
}

public class Program495
{
    public static void main(String[] args)
    {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(11);
        bst.insert(9);
        bst.insert(17);

        System.out.println("Inorder data is : ");
        bst.inorder();
    }
}
