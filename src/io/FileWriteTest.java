
package io;

import java.io.*;


public class FileWriteTest 
{
    
    public static void main(String[] args) throws IOException 
    {
        String s="i am limon kanti dey";
        FileWriter fw=new FileWriter("F:/a.txt");
        fw.write(s);
        fw.close();
        System.out.println("success!!!");
        
    }
}
