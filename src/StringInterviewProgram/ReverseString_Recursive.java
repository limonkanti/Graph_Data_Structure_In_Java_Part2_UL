package StringInterviewProgram;

public class ReverseString_Recursive {

    public static String reverse(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }

        String reversed =reverse(str.substring(1))+ str.charAt(0) ;
        System.out.println(reversed);
        return reversed;
    }

    public static void main(String args[]) {
        reverse("java");

    }
}
