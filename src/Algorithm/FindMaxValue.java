package Algorithm;

public class FindMaxValue {

    void findMaxValue(int ar[]) {

        int n = ar.length;
        int max = ar[0];
        for (int i = 1; i < n; i++) {
            if (max < ar[i]) {//min hole//min>ar[i]
                max = ar[i];
            }
        }
        System.out.println("The max value is:\t"+max);
    }

    public static void main(String args[]) {
        FindMaxValue ob = new FindMaxValue();
        int ar[] = {3, 2, 1, 7, 5};
        ob.findMaxValue(ar);

    }

}
