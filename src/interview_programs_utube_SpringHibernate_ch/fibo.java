
package interview_programs_utube_SpringHibernate_ch;

import Recursion.FiboRecursive;
import java.util.Scanner;

public class fibo 
{  int fiboTest(int n)
    {
        if((n==1)||(n==2))
            return 1;
        else
            return fiboTest(n-1)+fiboTest(n-2);
        
    }
     public static void main(String args[])
     {
         fibo ob=new fibo();
         System.out.println("Please enter range");
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         for(int i=1;i<=n;i++)
         {
             System.out.println(ob.fiboTest(i));
         }
        // System.out.println(ob.fiboTest(10));
         
     }
    
}
