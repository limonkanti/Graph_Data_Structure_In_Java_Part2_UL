package interview_programs_utube_SpringHibernate_ch;

import java.util.Arrays;

public class string_palindrome_26 {

    public void palimdrome(String s) {
        char ch[] = s.toCharArray();
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) 
        {
            str = str +ch[i];
           //System.out.print(ch[i]);
        }
     //   System.out.println("reverse string \t"+str);
        if(s.equals(str))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        

    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("aaa");
        String str = sb.toString();
        System.out.println(str);
        String k = sb.reverse().toString();
        System.out.println(k);
        if (str.equals(k)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        string_palindrome_26 ob = new string_palindrome_26();
        //ob.palimdrome("HelloWorld");
        ob.palimdrome("aaa");

    }

}
