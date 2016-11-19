
package Data_Structure;
class Node2
{
    protected int data;
    protected Node2 link;
    Node2()
    {
        data=0;
        link=null;
        
    }
    Node2(int d,Node2 n)
    {
       data=d;
       link=n;
    }
    public void setLink(Node2 n)
    {
        link=n;
        
    }
    public Node2 getLink()
    {
       return link;
    }
    public int getData()
    {
        return data;
    }
    
}

public class Test_SinglyLinkedList 
{
    
    protected Node2 start;
    protected Node2 end;
    public int size;
    Test_SinglyLinkedList()
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
    public void insertAtStart(int data)
    {
        Node2 link=new Node2(data,null);
        if(start==null)
        {
            start=link;
            end=start;
            
        }
        else
        {
            link.setLink(start);
            start=link;
            
        }
       size++; 
    }
    public void insertAtEnd(int data)
    {
        Node2 link=new Node2(data,null);
        if(start==null)
        {
            start=link;
            end=start;
            
        }
        else
        {
            end.setLink(link);
            end=link;
            
        }
       size++; 
    }
    public boolean delete()
    {
     
        if(start==null)
         {
                    
               return false;
         }
        else
        {
            start=start.link;
            
            return true;
        }
       
    }
    public void print()
    {
        Node2 nextLink=start;
        while(nextLink!=null)
        {
            System.out.println(nextLink.getData());
            nextLink=nextLink.getLink();
        }
        
    }
    public static void main(String args[])
    {
        Test_SinglyLinkedList ob=new Test_SinglyLinkedList();
        ob.insertAtStart(10);
        ob.insertAtStart(20);
        ob.insertAtEnd(30);
        //ob.insertAtEnd(40);
        ob.print();
        System.out.println(ob.getSize());
        ob.insertAtEnd(10);
        ob.print();
        ob.delete();
        ob.print();
        System.out.println(ob.getSize());
        
        
    }
    
}
