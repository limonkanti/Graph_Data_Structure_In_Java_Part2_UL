
package StringProgramms;

import java.util.Arrays;


public class StringAnagramTest
{
     public static void main(String[] args)
    {
        String s="mother";
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        String s1="rehto";
        char ch1[]=s1.toCharArray();
        Arrays.sort(ch1);
        if(Arrays.equals(ch, ch1))
        {
            System.out.println("Strings are anagram");
        }
       
        else
        {
            System.out.println("No!!! the string is not anagram");
        }
        
    }
    
}
