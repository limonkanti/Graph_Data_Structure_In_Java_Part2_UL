
package Data_Structure;

class Node11{
    protected int data;
    protected Node11 link;
    public Node11()
    {
        link=null;
        data=0;
    }
    public Node11(int d,Node11 n)
    {
        data=d;
        link=n;
        
    }
    public void setLink(Node11 n)
    {
        link=n;
        
    }
    public Node11 getLink()
    {
        return link;
    }
    public int getData()
    {
        return data;
    }
}
 
public class Test_CircularLinkedList 
{
    
     protected Node11 start;
    protected Node11 end;
    public int size;
    public Test_CircularLinkedList()
    {
        start=null;
        end=null;
        size=0;
        
    } 
    
    public void insertAtStart(int val)
    {
        Node11 nptr=new Node11(val,null);
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
        Node11 nptr=new Node11(val,null);
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
            Node11 ptr=start;
            while(ptr!=null)
            {
                System.out.println(ptr.getData());
                ptr=ptr.getLink();
            }
            
        }
    }
    public static void main(String args[])
    {
        Test_CircularLinkedList ob=new Test_CircularLinkedList();
        ob.insertAtStart(10);
        ob.insertAtStart(20);
        ob.print();
        
    }
    
    
}
