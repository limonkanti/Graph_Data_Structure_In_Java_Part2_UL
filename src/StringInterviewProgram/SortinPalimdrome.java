
package StringInterviewProgram;

import java.util.Arrays;


public class SortinPalimdrome
{
    String s1;
    void palindromeTest(String s)
    {
        // s="MADAM";
        String s1=s;
        String reverse="";
        for(int i=s.length()-1;i>=0;i--)
        {
            reverse=reverse+s.charAt(i);
        }
        if(reverse.equalsIgnoreCase(s1))
        {
            System.out.println("Yes!!!Palindrome...");
        }
        else
        {
            System.out.println("No!!!Not Palindrome...");
        }
    }
    
    public static void main(String args[])
    {
     
        SortinPalimdrome ob=new SortinPalimdrome();
        ob.palindromeTest("Madam");


    }
}
