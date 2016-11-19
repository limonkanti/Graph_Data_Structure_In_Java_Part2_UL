package javarevisited;

import java.util.Scanner;

public class permutation_string {

   public static void permu(int fixed, String str)
    {
        char ch[]=str.toCharArray();
        if(fixed==str.length())
        {
            System.out.println(str);
        }
        for(int i=fixed;i<str.length();i++)
        {
            char c=ch[i];
            ch[i]=ch[fixed];
            ch[fixed]=c;
            permu(fixed+1,new String(ch));
        }

    }

    public static void main(String[] args) {
        permu(0, "ABCD");

    }

}
