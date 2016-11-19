
package Data_Structure;

class Nod
{
    protected int data;
    protected Nod node;
    Nod()
    {
        data=0;
        node=null;
    }
    Nod(int value,Nod node)
    {
        data=value;
        node=node;
    }

    public Nod getNode() {
        return node;
    }

    public void setNode(Nod node) {
        this.node = node;
    }
   public int getData()
   {
       return data;
   }
    
    
}
public class TestSinglyLL 
{
    protected Nod start;
    protected Nod end;
    public int size;
    public TestSinglyLL()
    {
        start=null;
        end=null;
        size=0;
    } 
    public void addFirst(int n)
    {
        Nod node=new Nod(n,null);
        
        if(start==null)
        {
            start=node;
            end=start;
        }
        else
        {
            node.setNode(start);
            start=node;
        }
        size++;
    }
    public void addLast(int n)
    {
        Nod node=new Nod(n,null);
        if(start==null)
        {
            start=node;
            end=start;
        }
        else
        {
            end.setNode(node);
            end=node;
        }
         size++;
    }
    
    
    public void print()
    {
        if(size==0)
        {
            System.out.println("Empty");
        }
        else
        {
            Nod node=start;
            while(node!=null)
            {
                System.out.println(node.getData());
                node=node.getNode();
                
            }
        }
    }
    public boolean delete()
    {
        if(start==null)
        {
            return false;
        }
        else
        {
            start=start.node;
            return true;
        }
    }
    
    public static void main(String[] args) 
    {
        TestSinglyLL ob=new TestSinglyLL();
        ob.addFirst(10);
        ob.addFirst(20);
        ob.addFirst(30);
      //  ob.print();
        ob.addLast(40);
        ob.addLast(50);
        ob.print();
        System.out.println("Delete.......");
        ob.delete();
        System.out.println("other.......");
        ob.print();
        
        
    }
    
}
