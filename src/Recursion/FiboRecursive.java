
package Recursion;

import java.util.Scanner;

public class FiboRecursive 
{
    int fiboTest(int n)
    {
        if((n==1)||(n==2))
            return 1;
        else
            return fiboTest(n-1)+fiboTest(n-2);
        
    }
     public static void main(String args[])
     {
         FiboRecursive ob=new FiboRecursive();
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
