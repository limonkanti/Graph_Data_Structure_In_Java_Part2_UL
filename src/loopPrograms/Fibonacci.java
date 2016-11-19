
package loopPrograms;

import java.util.Scanner;

public class Fibonacci 
{
    public static void main(String args[])
    {
        System.out.println("Please Enter the length");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum;
        int f0=0,f1=1;
        for(int i=1;i<=n;i++)
        {
            
          sum=f0+f1;
          System.out.print(sum+" ");
          f1=f0;
          f0=sum;
        
               
        }
        
        
    }
    
}
