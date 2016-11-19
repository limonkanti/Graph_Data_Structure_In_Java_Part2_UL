
package data_structure_stack_queue_priorityQu_Deque;

import java.util.*;


public class QueueExample
{
    
    public void addData(Queue q, int i)
    {

        q.offer(i);
        System.out.print("add data to queue:\t"+q + "\t");
        System.out.println();

    }

    public void removeData(Queue q) 
    {
        int i=(int)q.poll();
       
        System.out.print("remove data from queue:\t"+i);
        System.out.println();
        

    }
    public void getSize(Queue q)
    {
        //Stack s=new Stack();
        System.out.println(q.size());
        
        
    }
    public void getTop(Queue q)
    {
        System.out.println(q.peek());
    }

    public static void main(String[] args) {
        QueueExample ob = new QueueExample();
        Queue q = new LinkedList();
        System.out.println("phsh data");
        ob.addData(q, 10);
        ob.addData(q, 20);
        ob.addData(q, 30);
        ob.addData(q, 40);
        System.out.println("pop data");
        ob.removeData(q);
        ob.removeData(q);
        System.out.println("Size of queue is");
        ob.getSize(q);
        System.out.println("Top of the element is peek()/element()");
        ob.getTop(q);
       

    }

    
}
