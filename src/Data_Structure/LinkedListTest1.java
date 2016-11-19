
package Data_Structure;


public class LinkedListTest1 
{
    private Link1 head=null;
    public int size;
    LinkedListTest1()
    {
        head=null;
        size=0;
    }
    public boolean isEmpty()
    {
        return(head==null);
    }
    public void insert(int data)
    {
        Link1 nextLink=new Link1(data);
        nextLink.next=head;
        head=nextLink;
        size++;
    }
    public boolean delete()
    {
        if(head==null)
            return false;
        head=head.next;
        return true;
    }
    public int size()
    {
        return size;
    }
    
    public void print()
    {
        Link1 current=head;
        while(current!=null)
        {
            System.out.println(current.getData());
            current=current.next;
        }
        
    }
    
    public static void main(String args[])
    {
        LinkedListTest1 ob=new LinkedListTest1();
        ob.insert(10);
        ob.insert(20);
        ob.insert(30);
        ob.print();
        System.out.println(ob.size);
       // ob.delete();
        ob.print();
        
        
    }
}
