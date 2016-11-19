
package data_structure_stack_queue_priorityQu_Deque;



public class StackOperation 
{
    int top;
    int stack[];
    int size;
    StackOperation(int size)
    {
        stack=new int[size];
        top=-1;
        size=0;
        
    }
    
    public void push(int value)
    {
        /*if(stack.length<=0)
        {
            System.out.println("UnderFlow");
        }
        else if(stack.length>)*/
        stack[++top]=value;
        size++;
        
    }
    public int peek()
    {
        return stack[top];
    }
    public void print()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(stack[i]);
        }
    }
    
    public int pop()
    {
        return stack[top--];
    }
    public boolean isEmpty()
    {
        return(top==-1);
    }
    public void size()
    {
        System.out.println(size);
    }
    
    
    public static void main(String[] args)
    {
        StackOperation ob=new StackOperation(5);
        ob.push(10);
        ob.push(20);
        ob.push(30);
        System.out.println(ob.peek());
         //ob.print();
       // ob.size();
        while(!ob.isEmpty())
        {
            int value=ob.pop();
            System.out.println("Pop\t"+value);
            
        }
        
        
        
    }
    
}
