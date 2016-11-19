
package Data_Structure;

class MinHeap 
{
    private int theHeap[];
    private int capacity;
    private int position;
    public MinHeap()
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
            while(theHeap[parent]>theHeap[child]&&parent>0)
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
class MinHeapImpl
{
    public static void main(String[] args) 
    {
        
        MinHeap ob=new MinHeap();
        ob.insert(12);
        ob.insert(7);
        ob.insert(6);
        ob.insert(10);
        ob.insert(8);
        ob.insert(20);
        ob.print();
    }
}