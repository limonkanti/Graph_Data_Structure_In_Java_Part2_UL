
package javarevisited;

import java.util.*;

public class first_non_repeatedChar
{
    public static void main(String[] args) {
        char ar[]={'a','b','a','c','b','d'};
        char ar2[];
         Set<Character> dupli=new HashSet<Character>();
         Set<Character> notdupli=new HashSet<Character>();
        int x=0;
       for(int i=0;i<ar.length;i++)
       {
           for(int j=0;j<ar.length;j++)
           {
               if(ar[i]!=ar[j])
               {
                    notdupli.add(ar[i]);
                    
               }
               else
               {
                   dupli.add(ar[i]);
                   break;
                   
               }
           }
       }
        
       
        
       
        System.out.println(dupli);
    }
    
}
