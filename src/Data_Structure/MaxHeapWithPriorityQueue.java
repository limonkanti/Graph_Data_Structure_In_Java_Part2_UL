
package Data_Structure;

import java.util.PriorityQueue;

public class MaxHeapWithPriorityQueue {

    public static void main(String args[]) {
        // create priority queue
        PriorityQueue<Integer> prq = new PriorityQueue<>((x,y) -> y-x);

        // insert values in the queue
        /*prq.add(90);
        prq.add(20);
        prq.add(57);
        prq.add(30);
        prq.add(12);
        prq.add(86);
        prq.add(48);
        prq.add(36);*/
        
        prq.add(35);
        prq.add(33);
        prq.add(42);
        prq.add(10);
        prq.add(14);
        prq.add(19);
        prq.add(27);
        prq.add(44);
        prq.add(26);
        prq.add(31);
        
        

        //print values
        while (!prq.isEmpty()) {
            System.out.print(prq.poll()+" ");
        }
    }

}