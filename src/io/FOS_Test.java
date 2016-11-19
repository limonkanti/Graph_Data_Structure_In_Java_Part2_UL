
package io;

import java.io.*;


public class FOS_Test
{
    public static void main(String[] args) {
        try
        {
            String s="i love myself";
        byte b[]=s.getBytes();
        FileOutputStream fos=new FileOutputStream("F:/a.txt");
        fos.write(b);
        fos.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
}
