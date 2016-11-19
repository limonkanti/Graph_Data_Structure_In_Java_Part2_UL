package data_structure_tree;

class TreeNode 
{

    public TreeNode left;
    public TreeNode right;
    public int data;

    TreeNode() 
    {
        left = null;
        right = null;
        data = 0;
    }

    TreeNode(int data)
    {
        left = null;
        right = null;
        this.data = data;
    }

    public int getData()
    {
        return data;
    }

    public void setData(int data) 
    {
        this.data = data;
    }

}

public class BinarySearchTreeTraverse 
{

    TreeNode root;

    public BinarySearchTreeTraverse()
    {
        root = null;
    }

    public void add(int data)
    {
        root = add(root, data);
    }

    TreeNode add(TreeNode root, int data) 
    {
        if (root == null)
        {
            root = new TreeNode(data);
        } 
        else if (root.getData() > data)
        {
            root.left = add(root.left, data);
        } 
        else if (root.getData() < data) 
        {
            root.right = add(root.right, data);
        }
        return root;

    }

    public static void preOrderTraversal(TreeNode root) 
    {
        if (root == null) 
        {
            return;
        }
        System.out.print(root.getData() + "\t");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }

    public static void inOrderTraversal(TreeNode root) 
    {
        if (root == null) 
        {
            return;
        }
        preOrderTraversal(root.left);
        System.out.print(root.getData() + "\t");

        inOrderTraversal(root.right);

    }

    public static void postOrderTraversal(TreeNode root) 
    {
        if (root == null)
        {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.getData() + "\t");

    }

    public static void main(String[] args) 
    {
        BinarySearchTreeTraverse ob = new BinarySearchTreeTraverse();
        ob.add(5);
        ob.add(1);
        ob.add(10);
        System.out.println("Preorder Traversal");
        preOrderTraversal(ob.root);
        System.out.println();

        System.out.println("Inorder Traversal");
        inOrderTraversal(ob.root);
        System.out.println();

        System.out.println("Postorder Traversal");
        postOrderTraversal(ob.root);
        System.out.println();

    }
}
