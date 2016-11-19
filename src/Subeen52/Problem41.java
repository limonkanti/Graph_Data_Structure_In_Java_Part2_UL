
package Subeen52;

import java.util.Scanner;

public class Problem41 
{
    public double fact(double n)
    {
        if(n==1)
            return  1;
        else
            return n*fact(n-1);
    }
    
    public static void main(String[] args) 
    {
        Problem41 ob=new Problem41();
        System.out.println("please enter a value");
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            
            sum=sum+((i)/ob.fact(i));
        }
        System.out.println(sum);
        
    }
    
}
