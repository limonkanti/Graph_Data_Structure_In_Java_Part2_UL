
package List_ArrayList;

import java.util.*;

public class Initialization
{
    public static void main(String args[])
    {
        List<Integer> li=new ArrayList<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
      
        System.out.println("Initialize using For-Each-Loop");
        for(int x:li)
        {
            System.out.println(x);
        }
        System.out.println("Initialize using Iteration Interface");
        Iterator itr=li.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        li.add(0,11);
        System.out.println("Add data using index based");
        for(int x:li)
        {
            System.out.println(x);
        }
        System.out.println("Initialize using For-Loop");
        for(int x=0;x<li.size();x++)
        {
            System.out.println(li.get(x));
        }
    }
    
}
