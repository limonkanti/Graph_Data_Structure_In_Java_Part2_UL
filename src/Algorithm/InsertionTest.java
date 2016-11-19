package Algorithm;

public class InsertionTest {

    void insertionSort(int ar[]) {
        int n = ar.length;
        for (int j = 1; j < n; j++) {
            int key = ar[j];
            int i = j - 1;
            while ((i >= 0) && (key < ar[i])) {
                ar[i + 1] = ar[i];
                i--;
            }
            ar[i + 1] = key;
        }

    }

    public static void main(String args[]) {
        int ar[] = {4, -3, 5, 2, 1};
        InsertionTest ob = new InsertionTest();
        ob.insertionSort(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

    }

}
