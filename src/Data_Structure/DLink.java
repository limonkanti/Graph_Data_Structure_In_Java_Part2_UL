
package Data_Structure;


public class DLink {
    private int data;
    public DLink next;
    public DLink previous;
    public DLink(int data)
    {
        this.previous=null;
        this.data=data;
        this.next=null;
        
        
    }
    public DLink(DLink previous,int data,DLink next)
    {
        this.previous=previous;
        this.data=data;
        this.next=next;
    }
    public int getData() {
        return data;
    }
    
    
    
}
