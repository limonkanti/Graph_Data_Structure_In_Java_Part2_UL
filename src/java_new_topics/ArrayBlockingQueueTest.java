package java_new_topics;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueTest {

    public static void main(String[] args) {
        BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(5);
        bq.add(1);
        bq.add(11);
        bq.add(111);
        bq.add(1111);
        bq.add(11111);
        bq.add(11111);
      //  bq.add(11);
       // bq.add(1);
        System.out.println(bq);
    }

}
