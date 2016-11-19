
package Data_Structure;

class Node1{
    protected int data;
    protected Node1 link;
    public Node1()
    {
        link=null;
        data=0;
    }
    public Node1(int d,Node1 n)
    {
        data=d;
        link=n;
        
    }
    public void setLink(Node1 n)
    {
        link=n;
        
    }
    public Node1 getLink()
    {
        return link;
    }
    public int getData()
    {
        return data;
    }
}
        
public class Circular_linkedList
{
    protected Node1 start;
    protected Node1 end;
    public int size;
    public Circular_linkedList()
    {
        start=null;
        end=null;
        size=0;
        
    } 
    
    public void insertAtStart(int val)
    {
        Node1 nptr=new Node1(val,null);
       nptr.setLink(start);
        if(start==null)
        {
            start=nptr;
            nptr.setLink(start);
            end=start;
            
        }
        else
        {
            
            end.setLink(nptr);
            start=nptr;
            
        }
        size++;
    }
    public void insertAtEnd(int val)
    {
        Node1 nptr=new Node1(val,null);
       
        if(start==null)
        {
            start=nptr;
            end=start;
            
        }
        else
        {
            end.setLink(nptr);
            end=nptr;
            
        }
         size++;
    }

    public void print()
    {
        if (size==0)
           System.out.println("Empty");
        else
        {
            Node1 ptr=start;
            while(ptr!=null)
            {
                System.out.println(ptr.getData());
                ptr=ptr.getLink();
            }
            
        }
    }

    public static void main(String args[])
    {
        Circular_linkedList ob=new Circular_linkedList();
        ob.insertAtStart(1);
        ob.insertAtStart(11);
         
        
     //   ob.getFirst();
     //   ob.delete();
        
        ob.print();
        
      //  ob.print();
        //ob.isEmpty();
    }
    
}
