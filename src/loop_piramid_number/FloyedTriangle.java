
package loop_piramid_number;

import java.util.Scanner;

/*
input 5
output:
1
23
456
78910
1112131415

*/
public class FloyedTriangle 
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
