
package Subeen52;

public class Problem50 
{
    public static void main(String[] args) {
        String s="4R5L9";
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if((ch[i]=='L'))
            {
               ch[i]=ch[i-1];
                System.out.print(ch[i]);
            }
            else if(ch[i]=='R')
             {
                   ch[i]=ch[i+1];  
                    System.out.print(ch[i]);
             }
            else
            {
                 System.out.print(ch[i]);
            }
        }
        System.out.println();
    }
    
}
