
package Data_Structure;

class MaxHeap 
{
    private int theHeap[];
    private int capacity;
    private int position;
    public MaxHeap()
    {
        position=1;
        capacity=10;
        theHeap=new int[capacity];
        
    }
    public void insert(int value)
    {
        if(position==capacity)
        {
            
        }
        else
        {
            theHeap[position++]=value;
            int child=position-1;
            int parent=child/2;
            while(theHeap[parent]<theHeap[child]&&parent>0)
            {
                int temp=theHeap[parent];
                theHeap[parent]=theHeap[child];
                theHeap[child]=temp;
                
                child=parent;
                parent=child/2;
                
            }
        }
        
    }
    public void print()
    {
        for(int i=1;i<position;i++)
        {
            System.out.println(theHeap[i]+"\t");
        }
    }
}
class MaxHeapImpl
{
    public static void main(String[] args) 
    {
        
        MaxHeap ob=new MaxHeap();
        ob.insert(12);
        ob.insert(7);
        ob.insert(6);
        ob.insert(10);
        ob.insert(8);
        ob.insert(20);
        ob.print();
    }
}