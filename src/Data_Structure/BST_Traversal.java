
package Data_Structure;

class BSTNode
{
    int data;
    BSTNode left;
    BSTNode right;

    public BSTNode() {
      data=0;
      left=null;
      right=null;
    }

    
    public BSTNode(int data) {
        this.data = data;
        this.left=null;
        this.right=null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    
    
}
class Add_Node_to_BST
{
    public BSTNode root;
    public Add_Node_to_BST()
    {
        root=null;
    }
    
    public void add(int value)
    {
        root=add(root,value);
        
    }
    private BSTNode add(BSTNode root,int value)
    {
        
        if(root==null)
        {
            root=new BSTNode(value);
        }
        else if(root.getData()>value)
        {
            root.left=add(root.left,value);
            
        }
        else if(root.getData()<value)
        {
            root.right=add(root.right,value);
            
        }
        return root;
    }
   
    
}

public class BST_Traversal 
{
    public static void preOrderTraversal(BSTNode root)
    {
        if(root==null) return;
        System.out.print(root.getData()+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public static void inOrderTraversal(BSTNode root)
    {
        if(root==null) return;
        inOrderTraversal(root.left);
        System.out.print(root.getData()+" ");
        inOrderTraversal(root.right);
    }
    public static void postOrderTraversal(BSTNode root)
    {
        if(root==null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.getData()+" ");
        
    }
    public static void main(String[] args)
    {
        
        Add_Node_to_BST ob=new Add_Node_to_BST();
        ob.add(7);
        ob.add(1);
        ob.add(0);
        ob.add(3);
        ob.add(2);
        ob.add(5);
        ob.add(4);
        ob.add(6);
        ob.add(9);
        ob.add(8);
        ob.add(10);
        System.out.println("Preorder");
        preOrderTraversal(ob.root);
        System.out.println();
        System.out.println("Inorder");
        inOrderTraversal(ob.root);
        System.out.println();
        System.out.println("Postorder");
        postOrderTraversal(ob.root);
        System.out.println();
        
    }
    
}
