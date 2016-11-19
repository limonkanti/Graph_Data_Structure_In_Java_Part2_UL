package Algorithm;

import java.util.Arrays;

public class Merge2Arrays {
    
    public static void main(String args[]) {
        int ar[] = {1, 2, 3, 4, 5};
        int n = ar.length;
        int ar2[] = {6, 7, 8, 9, 10};
        int ar3[] = new int[ar.length + ar2.length];
        for (int i = 0; i < ar.length; i++) {
            ar3[i] = ar[i];
        }
        for (int j = 0; j < ar2.length; j++) {
            ar3[j + ar.length] = ar2[j];
        }
        
        System.out.println(Arrays.toString(ar3));
        
    }
}
