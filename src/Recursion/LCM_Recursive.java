package Recursion;

import java.util.Scanner;

public class LCM_Recursive {

    public int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String args[]) {
        GCD_Recursive ob = new GCD_Recursive();
        System.out.println("Enter the value of x");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter the value of y");
        int y = sc.nextInt();
        int mul=x*y;
        int k = ob.gcd(x, y);
        System.out.println("GCD of x and y is\t"+k);
        int lcm=mul/k;
        System.out.println("LCM of x and y is:\t"+lcm);

    }
}
