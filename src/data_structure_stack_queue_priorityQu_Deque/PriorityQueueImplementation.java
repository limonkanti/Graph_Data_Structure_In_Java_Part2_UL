
package data_structure_stack_queue_priorityQu_Deque;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Student
{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString()
    {
        return name+"\t"+id;
    }
}
class PriorityIDBased implements Comparator<Student>
{

   
    public int compare(Student s1, Student s2) 
    {
        return s1.id-s2.id;
    }
    
}

public class PriorityQueueImplementation 
{
    public static void main(String[] args) 
    {
        
         PriorityIDBased ob=new PriorityIDBased();
         PriorityQueue<Student> pq=new PriorityQueue<Student>(ob);
         pq.add(new Student(5,"limon"));
         pq.offer(new Student(7,"Rajon"));
         pq.add(new Student(1,"S"));
         System.out.println(pq.poll());
         System.out.println(pq.poll());
         System.out.println(pq.poll());
       
    }
    
}
