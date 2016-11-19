
package loopPrograms;

import java.util.Scanner;

public class Quotient_Remainder 
{
    
 public static void main(String args[])
    {
        System.out.println("enter a Dividend number");
        Scanner sc=new Scanner(System.in);
        int Dividend=sc.nextInt();
        System.out.println("enter a Divisor number");
        int Divisor=sc.nextInt();
        int quotient,remainder;
      //  System.out.println("The prime numbers are upto\t"+n+"\t are");
        
        remainder=Dividend%Divisor;
        System.out.println("Remainder is"+remainder);
        quotient=Dividend/Divisor;
        System.out.println("Quotient is"+quotient);
        
       
    }
}
