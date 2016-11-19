
package loopPrograms;

import java.util.Scanner;

public class Lcm_Hcf2 
{
    public static void main(String args[])
    {
        int a, b, x, y, r, hcf, lcm;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Two Number : ");
        x = scan.nextInt();
        y = scan.nextInt();
		
        a = x;
        b = y;
		
        while(b != 0)
        {
            r=a%b;
            a=b;
            b=r;
            
        }
		
        hcf = a;
        lcm = (x*y)/hcf;
		
        System.out.print("HCF = " +hcf);
        System.out.print("\nLCM = " +lcm);
    }
    
}
