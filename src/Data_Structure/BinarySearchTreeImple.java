
package Data_Structure;

class NodeTree
{
    int data;
    NodeTree left;
    NodeTree right;

    public NodeTree() {
      data=0;
      left=null;
      right=null;
    }

    
    public NodeTree(int data) {
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
class BinarySearch
{
    NodeTree root;
    BinarySearch()
    {
        root=null;
    }
    public void add(int data)
    {
        root=add(root,data);
    }
    NodeTree add(NodeTree root,int data)
    {
        if(root==null)
        {
            root=new NodeTree(data);
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
   public boolean search(int x)
   {
       return search(root,x);
   }
   boolean search(NodeTree root,int x)
   {
       boolean found=false;
       while((root!=null)&&(!found))
       {
           if(root.getData()>x){
               root=root.left;
           }
           else if(root.getData()<x){
               root=root.right;
           }
           else
           {
               found=true;
               break;
           }
       }
       return found;
   }
    
}

public class BinarySearchTreeImple 
{
    public static void main(String[] args) 
    {
        BinarySearch ob=new BinarySearch();
        ob.add(10);
        ob.add(20);
        ob.add(40);
        ob.add(5);
        System.out.println(ob.search(55));
    }
}
