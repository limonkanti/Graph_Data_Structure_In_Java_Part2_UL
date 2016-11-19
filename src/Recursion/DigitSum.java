package Recursion;

public class DigitSum {

    int sum = 0;

    public int reverse(int n) {

        if (n == 0) {
            return sum;

        } else {
            sum = sum + (n % 10);
          reverse(n / 10);
         return sum;
        }
        
    }

    public static void main(String args[]) {
        DigitSum ob = new DigitSum();
        System.out.println(ob.reverse(223));
    }

}
