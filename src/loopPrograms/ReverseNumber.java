

package loopPrograms;

import java.util.Scanner;

public class ReverseNumber 
{
     public static void main(String args[])
    {
        System.out.println("Please Enter the renge");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mod,div;
        while(n!=0)
        {
            mod=n%10;
            System.out.print(mod);
            n=n/10;
            
        }
        
    }
    
}
