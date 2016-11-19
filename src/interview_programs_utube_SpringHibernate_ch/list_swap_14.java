
package interview_programs_utube_SpringHibernate_ch;

import java.util.*;


public class list_swap_14 
{
     public static void main(String[] args)
     {
         List <Integer> li=new ArrayList<Integer>();
         li.add(3);
         li.add(4);
         li.add(2);
         Collections.swap(li, 0, 2);
         System.out.println(li);
         
         
     }
    
}
