package Recursion;

import java.util.Scanner;

public class Factorial {

    public int fact(int n) {
        int result;
        if ((n == 0) || (n == 1)) {
            return 1;
        } else {
            result = n * fact(n - 1);
        }
        return result;

    }

    public static void main(String args[]) {
        Factorial ob = new Factorial();
        System.out.println("Please enter range");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        for (int i = 1; i <= n; i++) {
             System.out.println(ob.fact(i));

        }

    }

}
