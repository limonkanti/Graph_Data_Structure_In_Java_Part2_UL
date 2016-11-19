
package Data_Structure;

import java.util.Stack;


public class StackCollectionTest
{
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
     //   System.out.println("pop\t"+s.pop());
        System.out.println("top element\t"+s.peek());
    }
    
}
