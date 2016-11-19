package interview_coding_java2novice;

import java.util.*;

public class FindDuplicateValue_usingSet {

    public static void main(String[] args) {
        Set<Integer> dupli = new HashSet<Integer>();
        Set<Integer> notDupli = new HashSet<Integer>();
        ArrayList<Integer> al=new ArrayList<Integer>();
        int ar[] = {1, 2, 2, 4, 5, 6};
        for (int i = 0; i < ar.length; i++) 
        {
            int k=ar[i];
            if(!notDupli.contains(k))
            {
                notDupli.add(k);
            }
            else
            {
                dupli.add(k);
            }
            
        }
        System.out.println(dupli);

    }

}
