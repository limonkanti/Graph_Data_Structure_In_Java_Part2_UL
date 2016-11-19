package interview_programs_utube_SpringHibernate_ch;

import java.util.*;

public class check_char_17 {

    public static void main(String[] args) {
        System.out.println("Please enter a char");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if((c>='A'&&c<='Z')||((c>='a')&&c<='z'))
        {
            System.out.println("This is char");
        }
        else
        {
            System.out.println("Not Char");
        }
        
    }
}
