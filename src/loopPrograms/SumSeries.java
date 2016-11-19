
package loopPrograms;

import java.util.Scanner;

public class SumSeries 
{
     public static void main(String args[])
    {
       int i=0,sum=0;
       int n=3;
       for(i=1;i<=n;i++)
       {
           sum=(int) (sum+Math.pow(i, 3));
       }
       System.out.println(sum);
               
    }
    
    
}
