package Recursion;

import java.util.Scanner;

public class AdditionRecursive {

    int additionTest(int n) {
        int result;
        if ((n == 1) || (n == 0)) {
            return 1;
        } else {
            result = n + additionTest(n - 1);
        }
        return result;

    }

    public static void main(String args[]) {
        AdditionRecursive ob = new AdditionRecursive();
        System.out.println("Please enter range");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         System.out.println("Sum is:\t");
        System.out.println(ob.additionTest(n));

        // System.out.println(ob.fiboTest(10));
    }

}
