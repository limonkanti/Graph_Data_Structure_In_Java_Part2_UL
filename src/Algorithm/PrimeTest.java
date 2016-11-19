package Algorithm;

import java.util.*;

public class PrimeTest {

    public static void main(String args[]) {
        int ar[] = {2, 3, 5, 7, 8, 4, 6};
        ArrayList<Integer> al = new ArrayList<Integer>();
        int length = ar.length;
        int k = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                if ((ar[i] % j == 0) && i == j) {

                    al.add(j);

                }

            }

        }

        for (int x : al) {
            System.out.println(x);
        }

    }

}
