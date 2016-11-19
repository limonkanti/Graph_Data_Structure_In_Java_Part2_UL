package interview_programs_utube_SpringHibernate_ch;

import java.util.Scanner;

public class duplicateValue {

    public static void main(String[] args) {
        int ar[] = {1, 22, 33, 22};
        int i, j, item,count=0;
        System.out.println("please enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (i = 0; i < ar.length; i++) {
            if (ar[i] == n) 
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("duplicate");
        }
        else
        {
            System.out.println("not duplicate");
        }

    }

}
