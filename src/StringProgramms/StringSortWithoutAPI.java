
package StringProgramms;


public class StringSortWithoutAPI 
{
    
    
    public static void main(String[] args) 
    {
        String s="limon";
        char c[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<c.length;j++)
            {
                if(c[j]>c[i])
                {
                    char temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
            
        }
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]);
        }
        
    }
    
}
