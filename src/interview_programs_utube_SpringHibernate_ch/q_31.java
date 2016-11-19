package interview_programs_utube_SpringHibernate_ch;

import java.util.Arrays;
import java.util.Collections;

public class q_31 {

    public static void main(String[] args)
    {
        int ar[]={3,1,2,5,4};
        int temp[];
        System.out.println("Before Sort.");
        for (int i = 0; i < ar.length; i++)
        {
            System.out.println(ar[i]);
            
        }
        System.out.println("After Sort in Ascending order.");
        Arrays.sort(ar);
        for(int i = 0; i < ar.length; i++)
        {
            
            
           System.out.println(ar[i]);
        }
       

    }
}
