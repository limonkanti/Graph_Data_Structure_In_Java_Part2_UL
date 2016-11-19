
package javaconceptoftheday;

import java.util.Arrays;


public class Q_23_separate_zeros 
{
     public static void main(String[] args) 
     {
         int ar[]={3,2,0,1,0,5};
         Arrays.sort(ar);
         for(int i=0;i<ar.length;i++)
         {
             System.out.print(ar[i]+"\t");
         }
     }
    
}
