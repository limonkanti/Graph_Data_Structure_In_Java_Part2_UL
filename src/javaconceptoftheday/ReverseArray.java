
package javaconceptoftheday;

public class ReverseArray
{
    public static void main(String[] args) {
        int ar[]={5,4,3,2,1};
        for(int i=ar.length-1;i>=0;i--)
        {
            System.out.print(ar[i]+"\t");
        }
    }
}
