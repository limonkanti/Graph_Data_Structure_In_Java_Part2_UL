
package interview_programs_utube_SpringHibernate_ch;

import java.util.Scanner;


public class leap_year_29 
{
    
     public static void main(String[] args) 
     {
         System.out.println("Enter a numer");
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         if((n%4==0)&&(n%400==0))
             System.out.println("Leap year");
         else
         {
             System.out.println("Not leap year");
         }
     }
}
