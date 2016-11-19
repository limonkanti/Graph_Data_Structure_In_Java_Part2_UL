
package loop_piramid_number;


public class StarLoop2
{
      /*
input 5
output:
* 
* * * 
* * * * * 
* * * * * * * 
* * * * * * * * * 

*/
    public static void main(String args[])
    {
        int i, j;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<=2*i-1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
