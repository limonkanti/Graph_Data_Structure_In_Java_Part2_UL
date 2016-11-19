package Data_Structure;
import java.util.Stack;
public class StackExample
{
    public void addItem(Stack s,int n)
    {
    
        s.push(new Integer(n));
        System.out.println(s);
    }
    public void removeItem(Stack s)
    {
      
     int n=(int)s.pop();
     
       System.out.print(n);
    }
  
    public static void main(String[] args)
    {
        
        StackExample ob=new StackExample();
        StackExample ob1=new StackExample();
        Stack s=new Stack();
        ob.addItem(s, 10);
        ob1.addItem(s, 100);
        System.out.println("----------");
        Stack l=new Stack();
        ob.removeItem(s);
        
        
    }
    
}
