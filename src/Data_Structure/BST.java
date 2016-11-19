
package Data_Structure;

class TreeNode
{
   
    public TreeNode left;
    public TreeNode right;
    private int data;
   
    public TreeNode() {
        left = null;
        right = null;
        data = 0;
    }
     public TreeNode(int value) {
        left = null;
        right = null;
        this.data = value;
    }

    public int getData() {
        return data;
    }

    public void setData(int value) {
        this.data = value;
    }
  
}
public class BST
{
    public TreeNode root;
    public BST()
    {
        root=null;
    }
    
    public void add(int value)
    {
        root=add(root,value);
        
    }
    private TreeNode add(TreeNode root,int value)
    {
        
        if(root==null)
        {
            root=new TreeNode(value);
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
    public boolean search(int x)
    {
        return search(root,x);
    }
    private boolean search(TreeNode root,int x)
    {
        boolean found=false;
        while((root!=null)&&(!found))
        {
            if(root.getData()>x)
            {
                root=root.left;
            }
            else if(root.getData()<x)
            {
                root=root.right;
            }
            else
            {
                found=true;
                break;
            }
            found=search(root,x);
            
        }
        return found; 
    }
    
    
}
class BinarySearchTree
{
    public static void main(String[] args) 
    {
        
        BST ob=new BST();
        ob.add(5);
        ob.add(2);
        ob.add(18);
        ob.add(-4);
        ob.add(3);
        System.out.println(ob.search(8));
    }
}