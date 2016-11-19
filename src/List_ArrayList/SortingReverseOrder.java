
package List_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortingReverseOrder 
{
     public static void main(String args[])
    {
        List<Integer> li=new ArrayList<Integer>();
        li.add(3);
        li.add(1);
        li.add(2);
        System.out.println("Before Sorting");
        for(int x:li)
        {
            System.out.println(x);
        }
        System.out.println("After Sorting");
        Collections.sort(li, Collections.reverseOrder());
        for(int x:li)
        {
            System.out.println(x);
        }
    }
    
    
}
