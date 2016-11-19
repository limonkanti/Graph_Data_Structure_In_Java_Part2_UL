
package StringProgramms;

import java.util.Scanner;

public class StringRemoveGivenchar 
{
    public static void main(String[] args)
    {
        System.out.println("Enter a char which you want to remove");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        String s="limon";
        String s2=s.replace(c,' ');
        StringBuffer sb=new StringBuffer();
        char ch[]=s2.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!=' '&&ch[i]!='\t')
            {
                sb.append(ch[i]);
            }
        }
        System.out.println(sb);
        
    }
    
}
