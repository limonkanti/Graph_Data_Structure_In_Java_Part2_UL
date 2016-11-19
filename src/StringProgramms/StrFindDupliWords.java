
package StringProgramms;

import java.util.*;


public class StrFindDupliWords 
{
    public static void main(String[] args) 
    {
        
        String str[]={"limon","java","c","java","c","java","php"};
        HashSet<String> ts=new HashSet();
        HashSet<String> dupli=new HashSet<String>();
        HashSet<String> nondupli=new HashSet<String>();
        int count=0;
        for(int k=0;k<str.length;k++)
        {
           String s=str[k];
           
            if(!nondupli.contains(s))
            {
                nondupli.add(s);
            }
            else
            {
                dupli.add(s);
                
            }
        }
        System.out.println("The duplicate words are:\t"+dupli);
        
    }
    
}
