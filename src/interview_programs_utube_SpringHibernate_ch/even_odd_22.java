package interview_programs_utube_SpringHibernate_ch;

import java.util.Scanner;

public class even_odd_22 {

    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(((n/2)*2)==n)
        {
            System.out.println("Even number.");
        }
        else
        {
            System.out.println("Odd number.");
        }
    }
}
