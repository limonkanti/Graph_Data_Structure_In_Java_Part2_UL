package interview_programs_utube_SpringHibernate_ch;

import java.util.Scanner;

public class PrimeTest_34 {

    public static void main(String[] args) {
        System.out.println("please enter a number");
        Scanner sc = new Scanner(System.in);

        int flag = 0, m, n;
        n = sc.nextInt();
        m = n / 2;
        for (int i = 2; i <= m; i++) {
            if (n % i == 0) //  
            {
                System.out.println("Not prime");
                flag = 1;
                break;
            }

        }
        if (flag == 0) {
            System.out.println("prime");

        } 

    }
}
