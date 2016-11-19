

package loopPrograms;

import java.util.Scanner;

public class perfect_number
{
     public static void main(String args[])
     {
        System.out.println("Please Enter the length");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for (int i = 1; i <=n/2; i++) //6 and 18 perfect
        {
            if (n%i == 0) 
            {
                sum=sum+i;

            }

        }
        if(sum==n)
        {
            System.out.println("The number is perfect....");
            
        }
        else
        {
             System.out.println("The number is not perfect....");
            
        }

    }
}
