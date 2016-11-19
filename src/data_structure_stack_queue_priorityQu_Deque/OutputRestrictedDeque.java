
package data_structure_stack_queue_priorityQu_Deque;

import java.util.ArrayDeque;
import java.util.Deque;


public class OutputRestrictedDeque 
{
     public static void main(String[] args) 
    {
        //insert one side but can delete both side
        Deque OutputRestrictedDeque=new ArrayDeque();
        OutputRestrictedDeque.addFirst(1);
        OutputRestrictedDeque.addFirst(11);
        OutputRestrictedDeque.addFirst(111);
        OutputRestrictedDeque.addLast(1111);
        System.out.println(OutputRestrictedDeque);
        OutputRestrictedDeque.removeFirst();
        System.out.println(OutputRestrictedDeque);
        
        
    }
    
    
}
