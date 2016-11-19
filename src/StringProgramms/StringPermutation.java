
package StringProgramms;

public class StringPermutation 
{
    public static void permu(int fixed,String str)
    {
        char c[]=str.toCharArray();
        if(fixed==str.length())
        {
            System.out.println(str);
        }
        for(int i=fixed;i<str.length();i++)
        {
            char ch=c[i];
            c[i]=c[fixed];
            c[fixed]=ch;
            
            permu(fixed+1,new String(c));
            
        }
        
        
    }
    
    
    public static void main(String[] args) 
    {
        permu(0,"ABCD");
        
    }
    
}
