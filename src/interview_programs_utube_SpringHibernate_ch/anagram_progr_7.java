package interview_programs_utube_SpringHibernate_ch;

import java.util.Arrays;

public class anagram_progr_7 {

    public static void main(String[] args) {
        //if 2 strings have same similar chars then they are both anagram//limon=nomil anagram//limon/nomi not anagram.
        String str = "limon";
        String str2 = "noi3l";

        char ar[] = str.toCharArray();
        Arrays.sort(ar);
        char ar2[] = str2.toCharArray();
        Arrays.sort(ar2);
        // String s=new String(ar);//println(s)
        if (Arrays.equals(ar, ar2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not!!!");
        }
        // System.out.println(ar);
    }
}
