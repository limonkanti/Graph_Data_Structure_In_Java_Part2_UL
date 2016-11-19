package interview_programs_utube_SpringHibernate_ch;

import java.util.Scanner;

public class duplicateValue2 {

    public static void main(String[] args) {
        int ar[] = {1, 33, 22,7,8,33};
        int i, j, item, count = 0,number;
      //  System.out.println("please enter a number");
     //   Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        for (i = 0; i < ar.length; i++) 
        {
            for (j = 0; j < ar.length; j++)
            {
                if (ar[i] == ar[j]) 
                {
                    count++;
                    if(count==2)
                    {
                        number=ar[i];
                        System.out.println("Duplicate number is:\t"+number);
                    }
                }
            }

        }
       

    }

}
