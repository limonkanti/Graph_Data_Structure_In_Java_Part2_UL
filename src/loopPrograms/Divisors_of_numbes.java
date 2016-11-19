package loopPrograms;

import java.util.Scanner;

public class Divisors_of_numbes {

    public static void main(String args[]) {
        System.out.println("Please Enter the length");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum;
        for (int i = 1; i <=n; i++) {
            if (n%i == 0) {
                System.out.print(i+"\t");

            }

        }

    }

}
