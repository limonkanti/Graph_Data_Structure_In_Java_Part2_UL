
package Data_Structure;


public class StackImple 
{
    public int stackary[];
    private int top=-1;
    private int maxsize;
    
    
    StackImple(int size)
    {
        maxsize=size;
        stackary=new int[maxsize];
        top=-1;
    }
    public void push(int data)
    {
        stackary[++top]=data;
    }
    public void print()
    {
       
    }
    public int pop()
    {
        return stackary[top--];
    }
    
    public boolean isEmpty()
    {
        return (top==-1);
    }
    public static void main(String[] args) 
    {
        
        StackImple ob=new StackImple(5);
        ob.push(10);
        ob.push(20);
        ob.push(30);
        //
       // ob.pop();
        System.out.println("Stack datas");
        while(!ob.isEmpty())
        {
            int value=ob.pop();
            System.out.println(value);
        }
       
        
    }
}
