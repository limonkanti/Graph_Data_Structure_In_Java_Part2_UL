package Data_Structure;

import java.util.*;

public class QueueExampleTest {

    public void addItem(Queue<Integer> l, int n) {
        l.add(new Integer(n));
        
        System.out.println(l);
    }

    public void removeItem(Queue<Integer> l) {
        int n = (int) l.remove();
        System.out.println(n);
    }
    public void getTop(Queue<Integer> l)
    {
        int n=(int)l.element();
        System.out.println("top\t"+n);
    }

    public static void main(String[] args) {
        QueueExampleTest ob = new QueueExampleTest();
        QueueExampleTest ob1 = new QueueExampleTest();
        Queue<Integer> l = new LinkedList<Integer>();
        ob.addItem(l, 10);
        ob.addItem(l, 100);
        ob.addItem(l, 300);
        ob.getTop(l);
      //  ob.removeItem(l);
       

    }
}
