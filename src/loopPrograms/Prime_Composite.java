

package loopPrograms;

import java.util.Scanner;

public class Prime_Composite 
{
    public static void main(String args[])
    {
        System.out.println("Please Enter the renge");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1,j=2,sum=0,d=0;
        System.out.println("The prime numbers are upto\t"+n+"\t are");
        for(i=1;i<=n;i++)
        {
           if(n%i==0)
           {
               System.out.print(i+"\t");
               d++;
           }
        }
        if(d>=3)
        {
             System.out.println("The number is not a prime number");
        }
        else
        {
            System.out.println("The number is a prime number"+d);
        }
       
    }
    
}
