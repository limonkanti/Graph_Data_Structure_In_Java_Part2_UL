package OOPS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student implements Comparable {

    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Object o) {
        Student st = (Student) o;
        if (age == st.age) {
            return 0;
        } else if (age > st.age) {
            return 1;
        } else {
            return -1;
        }

    }

}

class TestSort3 {

    public static void main(String args[])
    {

        ArrayList al = new ArrayList();
        al.add(new Student(101,"Limon",25));
         al.add(new Student(103,"Rajon",30));
          al.add(new Student(105,"Robiul",20));
          Collections.sort(al);
          Iterator i=al.iterator();
          while(i.hasNext())
          {
              Student st=(Student)i.next();
              System.out.println(st.rollno+""+st.name+""+st.age);  
              
          }
    }
}
