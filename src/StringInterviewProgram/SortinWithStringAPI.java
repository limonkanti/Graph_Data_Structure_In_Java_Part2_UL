package StringInterviewProgram;

import java.util.Arrays;

public class SortinWithStringAPI {

    public static void main(String args[]) {
        String s = "limon";
        char[] c= s.toCharArray();
        Arrays.sort(c);
        String sorted1 = new String(c);
        System.out.println(sorted1);

        String original = "abcde";
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);

    }

}
