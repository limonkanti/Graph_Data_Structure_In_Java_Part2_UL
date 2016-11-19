
package java_new_topics;

import java.util.ArrayList;
import java.util.Arrays;


public class UtilityClass_Arrays 
{
    
    public static void main(String[] args)
    {
       int ar[]={2,6,4,3,2,1};
       Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
        System.out.println(Arrays.binarySearch(ar,3));
    }
}
