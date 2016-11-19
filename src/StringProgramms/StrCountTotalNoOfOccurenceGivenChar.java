
package StringProgramms;

import java.util.Scanner;


public class StrCountTotalNoOfOccurenceGivenChar 
{
    public static void main(String[] args) {
        String s="limonlimonnnnn";
        System.out.println("please enter a char");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        System.out.println("You want to search\t"+c);
        char ch[]=s.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==c)
            {
                count++;
            }
        }
        System.out.println("total number of occurences \t"+count);
    }
    
}
