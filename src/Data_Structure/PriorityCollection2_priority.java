package Data_Structure;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class Employee {

    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return salary + "\t" + name;
    }

}

class MyComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {

        if (e1.salary > e2.salary) {
            return 1;
        } else if (e1.salary == e2.salary) {
            return 0;
        } else {
            return -1;
        }

    }

}

class PriorityCollection2_priority {

    public static void main(String[] args) {
        MyComparator ob = new MyComparator();
        PriorityQueue<Employee> pqueue = new PriorityQueue<Employee>(ob);
        pqueue.offer(new Employee("a", 2000));
        pqueue.offer(new Employee("b", 3500));
      //  pqueue.offer(new Employee("c", 100));//
        System.out.println(pqueue);
      //  System.out.println("pool.\t" + pqueue.poll());
      //  System.out.println("pool.\t" + pqueue.poll());
      //  System.out.println("pool.\t" + pqueue.poll());

    }

}
