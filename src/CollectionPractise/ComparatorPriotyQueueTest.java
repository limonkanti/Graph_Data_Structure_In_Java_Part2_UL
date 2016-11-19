package CollectionPractise;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.*;

class Stu {

    int id;
    String name;
    int age;

    public Stu(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "\t" + age;

    }

}

public class ComparatorPriotyQueueTest implements Comparator<Stu> {

    @Override
    public int compare(Stu ob1, Stu ob2) {
        return ob1.age - ob2.age;
    }
}

class M {

    public static void main(String args[]) {
        ComparatorPriotyQueueTest ob = new ComparatorPriotyQueueTest();
        PriorityQueue<Stu> pq = new PriorityQueue<Stu>(ob);

        pq.add(new Stu("Limon", 27));
        pq.offer(new Stu("Kaju", 40));
        pq.add(new Stu("Rimon", 23));
        pq.add(new Stu("Timon", 28));
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }

}
