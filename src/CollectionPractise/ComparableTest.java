
package CollectionPractise;

import java.util.*;

public class ComparableTest implements Comparable<ComparableTest>
{
    int id;
    String name;

    public ComparableTest(int id, String name) {
        this.id = id;
        this.name = name;
    }
    

   
    public int compareTo(ComparableTest ob) 
    {
        if(id==ob.id)
        {
            return 0;
        }
        else if(id>ob.id)
        {
            return 1;
        }
        else
            return -1;
    }
    public static void main(String args[])
    {
        ArrayList<ComparableTest> al=new ArrayList<ComparableTest>();
        al.add(new ComparableTest(11,"limon") );
        al.add(new ComparableTest(1,"Tanvir") );
        al.add(new ComparableTest(2,"raju") );
        Collections.sort(al);
        for(ComparableTest c:al)
        {
            System.out.println(c.id+"\t"+c.name);
        }
         
    }
    
}
