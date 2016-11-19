
package StringInterviewProgram;

import java.util.*;


public class DuplicateWords
{
    public static void main(String[] args)
    {
        String s="Limon Limon Kanti Dey";
        List<String> list=Arrays.asList(s.split(" "));
       
        Set<String> uniqueWords =new HashSet<String>(list);
        for(String word:uniqueWords)
        {
           
            System.out.println(word+": "+Collections.frequency(list,word));
        }
    }
    
}
