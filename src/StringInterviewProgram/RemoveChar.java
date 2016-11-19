
package StringInterviewProgram;

import java.util.Scanner;

public class RemoveChar
{
    
     public static void main(String args[])
     {
         System.out.println("Enter a String");
         Scanner sc=new Scanner(System.in);
         String s=sc.next();
        StringBuilder sb=new StringBuilder(s);
         System.out.println("Enter the char position which you want to delete");
      //   int index=sc.nextInt();
      //  sb.deleteCharAt(index);
       // System.out.println(sb);
        // System.out.println("Enter a Char");
       ///  char c=sc.next().charAt(0);
         String newl=s.replaceAll("l", "");
         System.out.println(newl);
       
         
     }
}
