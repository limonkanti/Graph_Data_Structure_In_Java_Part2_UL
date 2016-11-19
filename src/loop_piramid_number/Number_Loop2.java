
package loop_piramid_number;

import java.util.Scanner;

public class Number_Loop2 
{
    /*
input 5
output:
1
12
123
1234
12345

*/
    
      public static void main(String args[])
    {
        System.out.println("Please Enter the length");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int k=1;
        for(int i=1;i<=n;i++)
        {
            
          for(int j=1;j<=i;j++)
          {
             System.out.print(j);
          }
        System.out.println();
               
        }
        
        
    }
    
}
