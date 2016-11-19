

package loopPrograms;

import java.util.Scanner;

public class Quadratic_Equ 
{
    public static void main(String args[])
    {
        System.out.println("Please enter the value of a,b and c");
        int a,b,c;
        double d,root1,root2;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=b*b-4*a*c;
        if(d>0)
        {
            root1=((-b)+Math.sqrt(d))/(2*a);
            root2=((-b)-Math.sqrt(d))/(2*a);
            System.out.println("Roots are real and unequal"+root1+"\t"+root2);
            
        }
        else if(d==0)
        {
            //root1=((-b)+Math.sqrt(d))/(2*a);
            root1=-b/2*a;
            System.out.println("Roots are real and equal"+root1);
            
        }
        else
        {
             System.out.println("No Solution");
        }
    }
    
}
