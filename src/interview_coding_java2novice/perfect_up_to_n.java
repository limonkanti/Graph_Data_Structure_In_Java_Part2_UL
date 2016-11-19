package interview_coding_java2novice;

import java.util.*;

public class perfect_up_to_n {

    public static void main(String[] args) {
        System.out.println("Please Enter 2 Numbers.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int k = n, i, j;

        for (i = 1; i <=n; i++)
        {
            int sum = 0;
            {
                for (j = 1; j <i; j++) 
                {
                    if ((i % j == 0)) 
                    {
                        sum = sum + j;
                    }
                }
                if (sum == i) {
                    System.out.println(i);
                }

            }

        }

    }

}
