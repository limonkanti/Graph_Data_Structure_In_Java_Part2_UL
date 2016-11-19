
package StringProgramms;


public class StrReverseEachWord 
{
    public static void main(String[] args) {
        String str="Reverse Me";
        String s[]=str.split(" ");
        for(int i=0;i<s.length;i++)
        {
            String s1=s[i];
            char ch[]=s1.toCharArray();
            for(int j=ch.length-1;j>=0;j--)
            {
                System.out.print(ch[j]);
            }
          System.out.print("\t");  
        }
        
    }
    
}
