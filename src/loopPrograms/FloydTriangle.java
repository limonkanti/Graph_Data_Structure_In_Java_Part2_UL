
package loopPrograms;

import java.util.Scanner;

public class FloydTriangle
{
     public static void main(String args[])
    {
        System.out.println("Please Enter the length");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int k=1;
        for(int i=1;i<=n;i++)
        {
            
          for(int j=1;j<=i;j++,k++)
          {
             System.out.print(k);
          }
        System.out.println();
               
        }
        
        
    }
    
}
