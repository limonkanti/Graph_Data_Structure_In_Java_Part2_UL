

package loopPrograms;

import java.util.Scanner;


public class find_power_of_number 
{
      public static void main(String args[])
    {
        System.out.println("Please Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        for(int i=1;i<=n/2;i++)
        {
           if(i*i==n)
           {
                
               System.out.println("root is possible!!!"); 
               break;
              
           }
          
          
        }
 
       
    }
    
}
