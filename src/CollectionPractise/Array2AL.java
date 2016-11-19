
package CollectionPractise;

import java.util.*;


public class Array2AL
{
    
    public static void main(String[] args) 
    {
        int ar[]={1,2,3,4,5};
        int k=0;
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<ar.length;i++)
        {
           k=ar[i];
           al.add(k);
        }
        System.out.println(al);
        
    }
}
