
package javaconceptoftheday;

import java.util.HashMap;
import java.util.Scanner;


public class Q_46Count_occurence_each_digit_Array 
{
     public static void main(String[] args) {
        //count digit of a array
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int ar[]={1,2,3,1,2,5,6};
       
        for(int i=0;i<ar.length;i++)
        {
            if(!hm.containsKey(ar[i]))
            {
                hm.put(ar[i],1);
               
            }
            else
            {
               
                hm.put(ar[i], hm.get(ar[i])+1);
            }
        }
        System.out.println(hm);
        //question 2...count first repeated and non repeated digit from array
        for(int i=0;i<ar.length;i++)
        {
            if(hm.get(ar[i])==1)
            {
                System.out.println("First non repeated digit\t"+ar[i]);
                break;
               
            }
           
        }
        for(int i=0;i<ar.length;i++)
        {
            if(hm.get(ar[i])>1)
            {
                System.out.println("First  repeated digit\t"+ar[i]);
                break;
               
            }
           
        }
        
       
    }

    
}
