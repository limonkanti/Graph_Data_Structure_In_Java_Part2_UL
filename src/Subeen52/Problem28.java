
package Subeen52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Problem28
{
    public static void main(String[] args) 
    {
         int ar[]={1,2,3,4,5,6,7,8};
         ArrayList<Integer> al=new ArrayList<Integer>();
         ArrayList<Integer> al2=new ArrayList<Integer>();
         for(int i=0;i<ar.length;i++)
         {
             int k=ar[i];
             al.add(k);
             al2.add(k);
         }
         Collections.sort(al2);
         if(al.equals(al2))
         {
             System.out.println("Array Is Sorted");
         }
         else
         {
             System.out.println("Not!!!!");
         }
        
         
        
    }
    
}
