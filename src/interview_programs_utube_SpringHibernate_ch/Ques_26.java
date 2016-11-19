package interview_programs_utube_SpringHibernate_ch;

import java.util.Arrays;

public class Ques_26 {

    public static void main(String[] args) {
        String str = "aaa";
        String str2 = "";
        char ch[] = str.toCharArray();
        for (int c = ch.length - 1; c >= 0; c--) {
            str2 = str2 + ch[c];

        }

        if (str.equals(str2)) {
            System.out.println("Palindrome!!!");
        } else {
            System.out.println("Not!!!");
        }
    }

}
