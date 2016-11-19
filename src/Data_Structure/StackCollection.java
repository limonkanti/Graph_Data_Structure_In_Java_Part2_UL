
package Data_Structure;

import java.util.Stack;

public class StackCollection 
{
    public static void main(String[] args) {
       Stack s=new Stack();
       s.push(1);
       s.push(22);
       s.push(3);
       System.out.println(s);
       System.out.println("Top item of stack\t"+s.peek());
       s.pop();
       System.out.println(s);
       System.out.println("empty test\t"+s.isEmpty());
       System.out.println("search element\t"+s.search(1));//position based
    }
    
}
