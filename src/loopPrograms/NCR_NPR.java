package loopPrograms;

import java.util.Scanner;

public class NCR_NPR {
 
   public static int fact(int num) {
       int i, fact = 1;
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;

    }

    public static void main(String args[]) {
        System.out.println("Please enter a number");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int r = sc.nextInt();
        NCR_NPR ob = new NCR_NPR();
        
        //  int ncr=((ob.fact(n))/(ob.fact(n-r))*(ob.fact(r)));
     //   System.out.print((ob.fact(n)) / (ob.fact(n - r)) * (ob.fact(r)));
       // System.out.print("NCR = "+ncr);
         System.out.print("NCR = " +(fact(n)/(fact(n-r)*fact(r))));
         System.out.print("\nNPR = " +(fact(n)/(fact(n-r))));
    }

}
