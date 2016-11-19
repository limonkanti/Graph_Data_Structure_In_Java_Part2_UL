
package data_structure_stack_queue_priorityQu_Deque;

import java.util.PriorityQueue;
import java.util.Queue;


public class PriorityQueueTopElementSearch
{
    
      public static void main(String[] args) {
        Queue q=new PriorityQueue();
        q.offer(10);
        q.offer(11);
        q.offer(9);
        q.add(2);
        q.offer(1);
        System.out.println("Get top element from P.Q using element()/peek() method.\t"+q.peek());
       
        
        
    }
}
