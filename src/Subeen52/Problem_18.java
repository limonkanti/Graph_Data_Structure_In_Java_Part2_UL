
package Subeen52;
import java.util.*;

public class Problem_18 
{
    public static void main(String[] args) {
        String str="limonkanti";
        ArrayList<Character> al=new  ArrayList<Character>();
        ArrayList<Character> al2=new  ArrayList<Character>();
        char ch[]=str.toCharArray();
        int count=0;
        char c[] = null,m[] = null;
        String s=null;
        String s1=null;
        for(int i=0;i<str.length();i++)
        {
           // char vowel=str.charAt(i);
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
            {
               al.add(ch[i]);
               
                
            }
            else
            {
                al2.add(ch[i]);
            }
           
           
        }
        System.out.print(al+"\t"+al2);
        //System.out.print(al2);
        
    }
    
}
