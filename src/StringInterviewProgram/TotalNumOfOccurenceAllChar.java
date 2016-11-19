
package StringInterviewProgram;

import java.util.*;

public class TotalNumOfOccurenceAllChar
{
    static void charCount(String input)
    {
        HashMap<Character,Integer> s=new HashMap<Character,Integer>();
        char ch[]=input.toCharArray();
        for(char c:ch)
        {
            if(s.containsKey(c))
            {
                s.put(c, s.get(c)+1);
                
            }
            else
            {
                s.put(c, 1);
            }
        }
        System.out.println(s);
        
        
    }
    public static void main(String args[])
    {
        charCount("i love java programming");
        
    }
    
}
