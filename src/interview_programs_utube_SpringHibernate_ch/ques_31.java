
package interview_programs_utube_SpringHibernate_ch;

import java.util.*;


public class ques_31
{
    
     public static void main(String[] args) 
     {
         ArrayList<Integer> al=new ArrayList<Integer>();
         al.add(3);
         al.add(1);
         al.add(2);
         Collections.sort(al);
         System.out.println("Sort Ascending order.:\t"+al);
         Collections.sort(al,Collections.reverseOrder());
         System.out.println("Sort Decending order.:\t"+al);
         
         
         
         
         
     }
}
