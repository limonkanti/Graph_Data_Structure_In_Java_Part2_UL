
package Subeen52;

import java.util.ArrayList;

public class Problem24
{
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6,7,8,12,13};
        int n=ar.length;
        int x=0;
        ArrayList<Integer> al=new ArrayList<Integer>();
         ArrayList<Integer> al2=new ArrayList<Integer>();
        for(int i=0;i<ar.length;i++,x++)
        {
            if(x%2==0)
            {
                int k=ar[i];
                al.add(k);
            }
            else
            {
                int l=ar[i];
                al2.add(l);
            }
           
        }
        System.out.println(al);
      
        
    }
}
