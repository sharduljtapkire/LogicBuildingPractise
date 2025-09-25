/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program490.java
//
//  Description : Binary Search Tree (BST) insertion program.
//                Supports insertion of unique integer nodes into a BST.
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

    // Optional: Method to display BST in-order for verification
    public void inOrderTraversal()
    {
        System.out.print("BST In-order: ");
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node)
    {
        if(node != null)
        {
            inOrder(node.lchild);
            System.out.print(node.data + " ");
            inOrder(node.rchild);
        }
    }
}

// Main class containing the entry point
public class Program490
{
    public static void main(String[] args)
    {
        BST bst = new BST();

        bst.insert(11);
        bst.insert(9);
        bst.insert(17);

        // Optional: Display BST to verify insertions
        bst.inOrderTraversal();
    }
}
