package Algorithm;

public class Find2ndLargestMaxValue {

    void find2ndLargestMaxValue(int ar[]) {
        int firstMax = ar[0];
        int secondMax = ar[0];
        int n = ar.length;
        for (int i = 0; i < n; i++) {
            if (firstMax < ar[i]) {
                firstMax = ar[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (secondMax < ar[i] && firstMax > ar[i]) {

                secondMax = ar[i];

            }
        }

        System.out.println("The Second max value is:\t" + secondMax);
    }

    public static void main(String args[]) {
        Find2ndLargestMaxValue ob = new Find2ndLargestMaxValue();
        int ar[] = {3, 2, 1, 7, 5, 10, 12};
        ob.find2ndLargestMaxValue(ar);

    }

}
