
package interview_coding_java2novice;

import java.util.Collections;
import java.util.Stack;

public class SortStack 
{
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(300);
        s.push(200);
        s.push(100);
       // s.sort(Collections.reverseOrder());
        Collections.sort(s);
        System.out.println(s);
        
    }
    
}
