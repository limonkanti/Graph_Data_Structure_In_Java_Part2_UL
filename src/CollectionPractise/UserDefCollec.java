
package CollectionPractise;

import java.util.*;


public class UserDefCollec 
{
    public static void main(String[] args)
    {
        
        Student ob=new Student("limon",11205061);
        Student ob2=new Student("Sh",11205062);
        ArrayList<Student> al=new  ArrayList<Student>();
        al.add(ob);
        al.add(ob2);
       // System.out.println(al.toString());
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            Student ss=(Student)itr.next();
            System.out.println(ss.name+"\t"+ss.id);
        }
        
    }
    
}
