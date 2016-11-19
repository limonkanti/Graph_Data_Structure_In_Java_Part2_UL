
package javaconceptoftheday;

import java.util.Scanner;


public class Q_20_TestNumber
{
    public static void main(String[] args)
    {
        System.out.println("Please enter a number");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(Integer.parseInt(s)==Integer.valueOf(s))
        {
            System.out.println("You have entered a number!!!!");
            
        }
        else
        {
            System.out.println("Not");
        }
        
    }
    
}
