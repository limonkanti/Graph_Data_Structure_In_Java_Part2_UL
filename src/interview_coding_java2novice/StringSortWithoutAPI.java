
package interview_coding_java2novice;


public class StringSortWithoutAPI 
{
    public static void main(String[] args) {
        String str="limon";
        char c[]=str.toCharArray();
        char temp;
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c.length;j++)
            {
                if(c[j]>c[i])
                {
                    temp=c[j];
                    c[j]=c[i];
                    c[i]=temp;
                }
               
            }
            
        }
        for(int k=0;k<c.length;k++)
        {
            
            System.out.print(c[k]);
        }
    }
}
