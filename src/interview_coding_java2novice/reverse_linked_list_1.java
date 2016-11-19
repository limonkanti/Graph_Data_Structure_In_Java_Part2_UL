
package interview_coding_java2novice;

import java.util.*;

public class reverse_linked_list_1
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> li=new LinkedList<Integer>();
        li.add(3);
        li.add(2);
        li.add(1);
        System.out.println("Before reverse:");
        System.out.println(li);
        Collections.reverse(li);
        System.out.println("After reverse:");
        System.out.println(li);
        
    }
    
}
