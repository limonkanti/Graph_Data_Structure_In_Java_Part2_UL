package Recursion;

class Fibonacci {

    public int fibo(int n) {
        int result;
        if (n == 0 || n == 1) {
            return n;
        } else {
            result = fibo(n - 1) + fibo(n - 2);
            return result;
        }
    }

    public static void main(String args[])
    {
        int i = 0, n = 11;
        for (i = 0; i < n; i++) 
        {
            Fibonacci ob=new Fibonacci();
            System.out.println(ob.fibo(i));

        }
    }

}
