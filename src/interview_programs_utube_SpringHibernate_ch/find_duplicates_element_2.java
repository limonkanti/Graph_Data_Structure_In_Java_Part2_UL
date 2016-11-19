
package interview_programs_utube_SpringHibernate_ch;

import java.util.*;


public class find_duplicates_element_2 
{
    public static void main(String[] args) {
        int ar[]={1,2,2,3,4,5,5};
        Set<Integer> dupli=new HashSet<Integer>();
        Set<Integer> nonDupli=new HashSet<Integer>();
        for(int x:ar)
        {
            if(!nonDupli.contains(x))
            {
                nonDupli.add(x);
            }
            else
            {
                dupli.add(x);
            }
        }
       System.out.println(dupli);
     
    }
    
}
