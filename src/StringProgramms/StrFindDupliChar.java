
package StringProgramms;

import java.util.*;


public class StrFindDupliChar
{
    
      public static void main(String[] args) 
    {
        
        String s="limonni";
        HashSet<Character> ts=new HashSet();
        HashSet<Character> dupli=new HashSet<Character>();
        HashSet<Character> nondupli=new HashSet<Character>();
        int count=0;
        char ch[]=s.toCharArray();
        for(int k=0;k<s.length();k++)
        {
           char c=ch[k];
           
            if(!nondupli.contains(c))
            {
                nondupli.add(c);
            }
            else
            {
                dupli.add(c);
                
            }
        }
        System.out.println(dupli);
        
    }
    
}
