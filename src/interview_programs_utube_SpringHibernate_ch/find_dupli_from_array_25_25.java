package interview_programs_utube_SpringHibernate_ch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.*;

public class find_dupli_from_array_25_25 {

    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5,5};
        Set<Integer> dupli = new HashSet<Integer>();
        Set<Integer> nonDupli = new HashSet<Integer>();
        for (int x : ar) {
            if (!nonDupli.contains(x)) {
                nonDupli.add(x);
            } else {
                dupli.add(x);
            }
        }
       
        if (dupli.size() > 0) {
            System.out.println("The array contains duplicate element.");
        } else {
            System.out.println("The array does not contain duplicate.");
        }
    }
}
