
package loop_piramid_number;

import java.util.Scanner;

public class Number_Loop3
{
    
    /*
input 5
output:
12345
1234
123
12
1

*/
    
      public static void main(String args[])
    {
        System.out.println("Please Enter the length");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int k=1;
        for(int i=n;i>=1;i--)
        {
            
          for(int j=1;j<=i;j++)
          {
             System.out.print(j);
          }
        System.out.println();
               
        }
        
        
    }
    
    
}
