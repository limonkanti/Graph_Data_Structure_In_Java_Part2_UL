package Subeen52;

import java.util.ArrayList;
import java.util.Scanner;

public class problem6 {

    public static void main(String args[]) {
        int a;
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int mod, div, i = 0, sum = 0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        int ar[]=new int[2];
        while (a != 0) {
            mod = a % 10;
            i++;
            if(i==1)
            {
                ar[0]=mod;
               
            }
            if(i==5)
            {
                ar[1]=mod;
            }
            a = a / 10;

            System.out.print(mod+"\t");
            //  System.out.println(sum); System.out.println(al);
        }
        System.out.println();
        for(int x=0;x<ar.length;x++)
        {
            sum=sum+ar[x];
            
        }
        System.out.println("sum"+sum);
    }

}
