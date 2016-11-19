
package OOPS;

import java.util.Scanner;


public class VarargsTest
{
    public static void disPlay(String... values)
    {
        System.out.println("output");
        for(String x:values)
        {
            System.out.println(x);
        }
    }
    void autoUn()
    {
        int a=50;
        Integer b=new Integer(a);
        
    }
    
    public static void main(String args[]) {
        

        disPlay();
       disPlay("i","am","learning","varagrs");
        

        
    }
}
