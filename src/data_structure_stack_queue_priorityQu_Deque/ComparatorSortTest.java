package data_structure_stack_queue_priorityQu_Deque;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Student1 {

    int id;
    String name;

    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return name + "\t" + id;
    }
}

class PriorityIDBased1 implements Comparator<Student1> {

    public int compare(Student1 ob1, Student1 ob2) 
    {
        ////process 1.......
        /*if(ob1.id==ob2.id)
        {
            return 0;
        }
        else if(ob1.id>ob2.id)
        {
            return 1;
        }
        else
        {
            return -1;
        }*/
        ////process 2........
        return ob1.id-ob2.id;
       
    }

}

public class ComparatorSortTest {

    public static void main(String[] args) {
        PriorityIDBased1 ob = new PriorityIDBased1();
        ArrayList<Student1> al = new ArrayList();
        al.add(new Student1(11, "limon"));
        al.add(new Student1(1, "Rajon"));
        al.add(new Student1(111, "Julia"));
        Collections.sort(al, new PriorityIDBased1());
        System.out.println("System 1..");
        System.out.println(al);
         System.out.println("System 2..");
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Student1 st = (Student1) itr.next();
            System.out.print(st.id + "\t" + st.name);
            System.out.println();
        }

    }

}
