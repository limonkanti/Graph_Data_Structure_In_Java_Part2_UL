package interview_programs_utube_SpringHibernate_ch;

import Recursion.Factorial;
import java.math.BigInteger;
import java.util.Scanner;

public class fact_bigNumber_3 {

    public static void main(String args[]) {

        System.out.println("Please enter range");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger fact = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));

        }
        System.out.println(fact);
    }

}
