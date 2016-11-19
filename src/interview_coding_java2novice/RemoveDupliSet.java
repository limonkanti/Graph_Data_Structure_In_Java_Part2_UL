
package interview_coding_java2novice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupliSet
{
    public static void main(String[] args)
    {
        Set<Integer> s=new HashSet<Integer>();
        Set<Integer> s1=new HashSet<Integer>();
        int ar[]={1,2,2,4,5,6};
        for(int i=0;i<ar.length;i++)
        {
           int k=ar[i];
            s.add(k);
        }
        for(int x:s)
        {
            System.out.println(x);
        }
        
    }
    
}
