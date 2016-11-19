
package Data_Structure;

class Node{
    protected int data;
    protected Node link;
    public Node()
    {
        link=null;
        data=0;
    }
    public Node(int d,Node n)
    {
        data=d;
        link=n;
        
    }
    public void setLink(Node n)
    {
        link=n;
        
    }
    public Node getLink()
    {
        return link;
    }
    public int getData()
    {
        return data;
    }
}
        
public class Singly_linkedList
{
    protected Node start;
    protected Node end;
    public int size;
    public Singly_linkedList()
    {
        start=null;
        end=null;
        size=0;
        
    } 
    public boolean isEmpty()
    {
        return start==null;
    }
    public int getSize()
    {
        return size;
    }
    public void insertAtStart(int val)
    {
        Node nptr=new Node(val,null);
        size++;
        if(start==null)
        {
            start=nptr;
            end=start;
            
        }
        else
        {
            nptr.setLink(start);
            start=nptr;
            
        }
    }
    public void insertAtEnd(int val)
    {
        Node nptr=new Node(val,null);
       
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
   /* public void insertAtPos(int val,int pos)
    {
        Node nptr=new Node(val,null);
        Node ptr=start;
        pos=pos-1;
        for(int i=1;i<size-1;i++)
        {
            if(i==pos)
            {
                Node tmp=ptr.getLink();
                ptr.setLink(nptr);
                
            }
            
        }
        
    }*/
    public boolean delete()
    {
        if(start==null)
            return false;
        else
        {
            start=start.link;
            return true;
        }
    }
    
    public void clear()
    {
        size=0;
    }
    public void print()
    {
        if (size==0)
           System.out.println("Empty");
        else
        {
            Node ptr=start;
            while(ptr!=null)
            {
                System.out.println(ptr.getData());
                ptr=ptr.getLink();
            }
            
        }
    }
    public void getFirst()
    {
        if(start!=null)
        {
            System.out.println(start.getData());
        }
    }
    
     public void getLast()
    {
        if(end!=null)
        {
            System.out.println(end.getData());
        }
    }
    
    public static void main(String args[])
    {
        Singly_linkedList ob=new Singly_linkedList();
        ob.insertAtStart(1);
        ob.insertAtStart(11);
         ob.getFirst();
         ob.getLast();
        System.out.println("Size is:\t"+ob.getSize());
     //   ob.getFirst();
     //   ob.delete();
        
        ob.print();
        ob.delete();
        ob.print();
        //ob.isEmpty();
    }
    
}
