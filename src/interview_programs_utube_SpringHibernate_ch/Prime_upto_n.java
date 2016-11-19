package interview_programs_utube_SpringHibernate_ch;

import java.util.Scanner;

public class Prime_upto_n {

    public static void main(String args[]) {
        System.out.println("please enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
         System.out.println("Prime numbers are upto\t"+n);
        for (i = 2; i <= n; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }

            }
            if (i == j) 
            {

                System.out.print(i+"\t");
            }

        }
    }

}
