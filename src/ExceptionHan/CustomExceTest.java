package ExceptionHan;

public class CustomExceTest {

    static void test(int age) throws InvalidException {
        if (age < 18) {
            throw new InvalidException("Not Valid");
        } else {
            System.out.println("Valid......");
        }

    }

    public static void main(String[] args) {
        try {

            test(8);

        } catch (Exception i) {
            System.out.println(i);
        }
        System.out.println("Rest of the code");
    }

}
