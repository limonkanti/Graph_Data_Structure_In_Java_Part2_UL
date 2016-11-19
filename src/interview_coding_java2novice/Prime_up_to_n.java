package interview_coding_java2novice;

import java.util.Scanner;

public class Prime_up_to_n {

    public static void main(String args[]) {
        System.out.println("Please Enter the renge");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2, j = 2, sum = 0;
        System.out.println("The prime numbers are upto\t" + n + "\t are");
        for (i = 2; i <= n; i++) {
            for (j = 2; j <= i; j++) {
                if ((i % j) == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.print(i + "\t");
            }
            if (i == j) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of prime numbers is" + sum);
    }

}
