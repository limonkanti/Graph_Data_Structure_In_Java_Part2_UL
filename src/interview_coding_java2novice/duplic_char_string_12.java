
package interview_coding_java2novice;

import java.util.*;

public class duplic_char_string_12 
{
    static void duplicahrCount(String inputString)
    {
        HashMap<Character,Integer> charcount=new HashMap<Character,Integer>();
        char[] strArray= inputString.toCharArray();
        for(char c:strArray)
        {
            if(charcount.containsKey(c))
            {
                charcount.put(c, charcount.get(c)+1);
            }
            else
            {
                charcount.put(c, 1);
            }
            
        }
        Set<Character> charInString=charcount.keySet();
        System.out.println("Dupli char in:\t"+inputString);
        for(char ch:charInString)
        {
            if(charcount.get(ch)>1)
            {
                System.out.println(ch+"\t"+charcount.get(ch));
            }
        }
        
    }
    public static void main(String[] args) {
        duplicahrCount("Limonon");
    }
    
}
