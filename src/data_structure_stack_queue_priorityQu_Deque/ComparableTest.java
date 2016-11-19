
package data_structure_stack_queue_priorityQu_Deque;

import java.util.ArrayList;
import java.util.*;


class Employee implements Comparable<Employee>
{
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public String toString()
    {
        return name+"\t"+salary;
    }

    @Override
    public int compareTo(Employee e) 
    {
        if(e.salary==salary)
        {
            return 0;
        }
        else if(e.salary>salary)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
    
    
}

public class ComparableTest 
{
    public static void main(String[] args) {
        ArrayList<Employee> al=new ArrayList<Employee>();
        al.add(new Employee("Rajon",20000));
        al.add(new Employee("Limon",30000));
        al.add(new Employee("zaj",15000));
        Collections.sort(al);
        ////process 1.............
        System.out.println(al);
        /////process 2...........
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            Employee em=(Employee)itr.next();
            System.out.print(em.salary+"\t"+em.name);
            System.out.println();
        }
        
    }
}
