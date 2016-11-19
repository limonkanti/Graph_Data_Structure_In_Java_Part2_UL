
package javaconceptoftheday;


public class Q_60_FloyedTriangle 
{
    public static void main(String[] args) {
        int i,j,k=1,n=5;
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++,k++)
            {
                System.out.print(k+"\t");
            }
            System.out.println();
        }
        
    }
    
}
