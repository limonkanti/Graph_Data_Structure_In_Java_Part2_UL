
package data_structure_stack_queue_priorityQu_Deque;


public class QueueOperation 
{
    int queue[];
    int size;
    int top;
    int front;
    int rear;
    QueueOperation(int size)
    {
        queue=new int[size];
        front=-1;
        rear=-1;
        top=-1;
        size=0;
        
    }
    public void push(int data)
    {
        queue[++rear]=data;
        size++;
    }
    public void print()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(queue[i]);
        }
    }
    public int pop()
    {
        return queue[++front];
    }
    public boolean isEmpty()
    {
        return(top==-1);
    }
    public void getSize()
    {
        System.out.println("Size is.\t"+size);
    }
    public static void main(String[] args)
    {
        
        QueueOperation ob=new QueueOperation(5);
        System.out.println("Insert value");
        ob.push(10);
        ob.push(20);
        ob.push(30);
        System.out.println("Traversing");
        ob.print();
        System.out.println("Pop Operation");
        System.out.println(ob.pop());
        System.out.println(ob.pop());
        System.out.println(ob.pop());
        ob.push(40);
        ob.print();
        
        
        
    }
    
}
