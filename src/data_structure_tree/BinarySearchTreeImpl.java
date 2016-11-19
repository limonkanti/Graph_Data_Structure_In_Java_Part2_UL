
package data_structure_tree;

class Node
{
    public Node left;
    public Node right;
    public int data;
    Node()
    {
        left=null;
        right=null;
        data=0;
    }
  Node(int data)
    {
        left=null;
        right=null;
        this.data=data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
   
}

public class BinarySearchTreeImpl
{
    Node root;
    public BinarySearchTreeImpl()
    {
        root=null;
    }
    public void add(int data)
    {
        root=add(root,data);
    }
    Node add(Node root,int data)
    {
        if(root==null)
        {
            root=new Node(data);
        }
        else if(root.getData()>data)
        {
            root.left=add(root.left,data);
        }
        else if(root.getData()<data)
        {
            root.right=add(root.right,data);
        }
        return root;
        
    }
    public boolean search(int data)
    {
        return search(root,data);
    }
    boolean search(Node node,int data)
    {
        boolean found=false;
        while((root!=null)&&(!found))
        {
            if(root.getData()>data)
            {
                root=root.left;
            }
            else if(root.getData()<data)
            {
                root=root.right;
            }
            else
            {
                found=true;
                break;
            }
            found=search(root,data);
        }
        return found;
    }
    public static void main(String[] args) 
    {
        BinarySearchTreeImpl ob=new BinarySearchTreeImpl();
        ob.add(10);
        ob.add(50);
        ob.add(20);
        ob.add(30);
        ob.add(60);
        System.out.println(ob.search(60));
        
    }
    
}
