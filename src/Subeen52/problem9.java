
package Subeen52;

import java.util.Scanner;

public class problem9
{
    public static void main(String args[])
    {
        double a;
        System.out.println("Please enter a number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        double root=Math.sqrt(a);
        if(root*root==a)
        {
            System.out.println("Yes!!!");
        }
        else
        {
             System.out.println("No!!!");
            
        }
        
        
    }
    
}
