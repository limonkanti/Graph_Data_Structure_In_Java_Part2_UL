
package StringProgramms;


public class StringRemoveWhiteSpaceWUL 
{
    public static void main(String[] args) 
    {
        String s="i  love j ava";
        StringBuffer sb=new StringBuffer();
        char ch[]=s.toCharArray();
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
