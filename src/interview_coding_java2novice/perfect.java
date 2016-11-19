package interview_coding_java2novice;

import java.util.Scanner;

public class perfect {

    public static void main(String[] args) {
        System.out.println("Please Enter A Decimal Number.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n, sum = 0;
        for (int j = 1; j <= k / 2; j++) {
            if ((k % j == 0)) {
                sum = sum + j;
            }
        }
        if (n == sum) {
            System.out.println("Perfect!!!");
        } else {
            System.out.println("Not Perfect!!!");
        }
    }

}
