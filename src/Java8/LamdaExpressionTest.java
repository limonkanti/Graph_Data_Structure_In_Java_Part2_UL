package Java8;

public class LamdaExpressionTest {

    interface MathOperation {

        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    public static void main(String args[]) {
        System.out.println("Java 8 test");

        LamdaExpressionTest ob = new LamdaExpressionTest();
        MathOperation add = (int a, int b) -> a + b;
        System.out.println(ob.operate(5, 5, add));

    }

}
