
package interview_coding_java2novice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDupliValue_U_Set 
{
     public static void main(String[] args) {
        Set<Integer> dupli = new HashSet<Integer>();
        Set<Integer> removeDupli = new HashSet<Integer>();
        ArrayList<Integer> al=new ArrayList<Integer>();
        int ar[] = {1, 2, 2, 4, 5, 6};
        for(int i=0;i<ar.length;i++)
        {
            int k=ar[i];
            if(!removeDupli.contains(k))
            {
                removeDupli.add(k);
            }
        }
        for(int x:removeDupli)
        {
            System.out.println(x);
        }
        
     }
    
}
