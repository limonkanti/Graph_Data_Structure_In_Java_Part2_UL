package Recursion;

public class GCD_Recursive {

    public int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String args[]) {
        GCD_Recursive ob = new GCD_Recursive();
       int k= ob.gcd(20, 8);
        System.out.println(ob.gcd( 8,5));
        
    }

}
