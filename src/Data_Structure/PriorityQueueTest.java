
package Data_Structure;

import java.util.PriorityQueue;

public class PriorityQueueTest 
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        pq.add(2);
        pq.add(3);
        pq.add(1);
        pq.add(2);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
    }
    
}
