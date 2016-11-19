package StringInterviewProgram;

public class CountNumberOfWords {

    public static void main(String args[]) {
        String s1 = "limon kanti dey";
        String s2[] = s1.split("\\s");
        int length = s2.length;
        System.out.println(length);

    }
}
