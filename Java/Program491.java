/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program491.java
//
//  Description : Binary Search Tree (BST) insertion with in-order traversal.
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

class BST
{
    private Node root;

    public BST()
    {
        root = null;
    }

    public void insert(int no)
    {
        Node newn = new Node(no);

        if(root == null) // BST is empty
        {
            root = newn;
            return;
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
                else if(no > temp.data) // rchild
                {
                    if(temp.rchild == null)
                    {
                        temp.rchild = newn;
                        break;
                    }
                    temp = temp.rchild;
                }
                else // no < temp.data -> lchild
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

    public void inOrder()
    {
        inOrderTraversal(root);
        System.out.println();
    }

    private void inOrderTraversal(Node node)
    {
        if(node != null)
        {
            inOrderTraversal(node.lchild);
            System.out.print(node.data + " ");
            inOrderTraversal(node.rchild);
        }
    }
}

// Main class containing the entry point
public class Program491
{
    public static void main(String[] args)
    {
        BST bst = new BST();

        bst.insert(11);
        bst.insert(9);
        bst.insert(17);

        // Display in-order traversal
        System.out.print("In-order Traversal of BST: ");
        bst.inOrder();
    }
}
