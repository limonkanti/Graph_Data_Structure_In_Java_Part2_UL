package interview_programs_utube_SpringHibernate_ch;

import java.util.*;

public class string_duplicates {

    public static void main(String[] args) {
        String str[]={"anik","anik","baby","limon","baby"};
        Set<String> al = new HashSet<String>();
        al.add("limon");
        al.add("anik");
        al.add("bali");
        al.add("anik");
        Set<String> dupli = new HashSet<String>();
        Set<String> notDupli = new HashSet<String>();
        for(int i=0;i<str.length;i++)
        {
            String s=str[i];
            if(!notDupli.contains(s))
            {
                notDupli.add(s);
            }
            else
            {
                dupli.add(s);
            }
            
        }
        System.out.println(dupli);

    }
}
