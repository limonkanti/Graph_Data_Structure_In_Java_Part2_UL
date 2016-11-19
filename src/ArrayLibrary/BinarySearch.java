
package ArrayLibrary;

import java.util.Arrays;


public class BinarySearch 
{
    public static void main(String args[])
    {
        int x[]={40,20,30,10,50}; 
        int l=Arrays.binarySearch(x, 30);
        System.out.println(l);
        System.out.println(Arrays.binarySearch(x, 100));
        
         
     
        
    }
    
}
