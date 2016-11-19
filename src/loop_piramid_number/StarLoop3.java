
package loop_piramid_number;


public class StarLoop3
{
   /* input 5
output:
/./i should count space....
        *
      ***
    *****
  *******
*********
*/
    public static void main(String args[])
    {
        int i, j,k=8;
        for(i=1; i<=5; i++)
        {
            for(j=1;j<=k;j++)
          //   for(j=1;j<=k;j++)   
            {
                System.out.print(" ");
            }
            k=k-2;
            for(j=1; j<=2*i-1; j++)
            {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
    
    
}
