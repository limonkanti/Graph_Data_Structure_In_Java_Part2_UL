
package loopPrograms;

import java.util.Scanner;


public class count_digits_from_number 
{
     public static void main(String args[])
    {
        System.out.println("Please Enter the renge");
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        int mod,div;
        while(n!=0)
        {
            mod=n%10;
            count++;
            n=n/10;
            
        }
        System.out.println("Total no of digits are:\t"+count);
        
        
    }
    
}
