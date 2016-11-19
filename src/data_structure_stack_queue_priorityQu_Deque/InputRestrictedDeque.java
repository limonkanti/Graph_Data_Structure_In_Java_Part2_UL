
package data_structure_stack_queue_priorityQu_Deque;

import java.util.*;

public class InputRestrictedDeque 
{
    public static void main(String[] args) 
    {
        //insert one side but can delete both side
        Deque inputRestrictedDeque=new ArrayDeque();
        inputRestrictedDeque.addFirst(1);
        inputRestrictedDeque.addFirst(11);
        inputRestrictedDeque.addFirst(111);
        inputRestrictedDeque.add(1111);
        System.out.println(inputRestrictedDeque);
        inputRestrictedDeque.removeFirst();
        inputRestrictedDeque.removeLast();
        System.out.println(inputRestrictedDeque);
        
    }
    
}
