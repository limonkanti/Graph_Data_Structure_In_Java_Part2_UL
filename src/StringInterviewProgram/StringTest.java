package StringInterviewProgram;

public class StringTest {

    public static void main(String[] args) {
        /*  String s1 = new String("pankaj");
         String s2 = new String("PANKAJ");
         System.out.println(s1 = s2);*/
        /* String s1 = new String("abc");
         String s2 = new String("abc");
         System.out.println(s1==s2);*/

        String s1 = "abc";
        StringBuffer s2 = new StringBuffer(s1);
        System.out.println(s1.equals(s2));
    }

}
