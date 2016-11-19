

package StringInterviewProgram;

public class SortingOutStringAPI 
{
    public static void main(String args[])
    {
        String s="eafcd";
        char temp=0;
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c.length;j++)
            {
                if(c[j]>c[i])
                {
                    temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
            
        }
        
        
    }
    
}
