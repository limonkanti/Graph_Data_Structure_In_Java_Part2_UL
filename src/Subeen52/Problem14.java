
package Subeen52;

import java.util.Scanner;


public class Problem14 
{
    public static void main(String args[]) 
    {
        String str="limon kanti";
        char ch[]=str.toCharArray();
        System.out.println("Please enter a char");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==c)
            {
                count++;
            }
           
            
        }
        if(count>0)
        {
            System.out.println(count);
        }
        else
        {
            System.out.println(c+"\t is not present");
        }
       
    }
}
