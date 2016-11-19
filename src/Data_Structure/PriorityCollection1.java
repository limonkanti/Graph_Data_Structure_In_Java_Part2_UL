
package Data_Structure;

import java.util.*;

public class PriorityCollection1 
{
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        pQueue.offer(3);
        pQueue.offer(1);
        pQueue.offer(2);
        /*Ascending order pool korle bujha jai*/
        pQueue.offer(4);
        //System.out.println(pQueue.element());
        //System.out.println(pQueue.peek());
        System.out.println(pQueue);
        pQueue.poll();
        System.out.println(pQueue);
        pQueue.poll();
        System.out.println(pQueue);
        pQueue.poll();
        System.out.println(pQueue);
    }
    
}
