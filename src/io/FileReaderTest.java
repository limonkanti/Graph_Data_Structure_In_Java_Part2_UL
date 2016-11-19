
package io;

import java.io.*;
import java.io.IOException;


public class FileReaderTest 
{
    
    public static void main(String[] args) throws IOException 
    {
        
        FileReader fw=new FileReader("F:/a.txt");
        int i;
        while((i=fw.read())!=-1)
        {
            System.out.print((char)i);
            
        }
        
        fw.close();
        
        System.out.println("success!!!");
        
    }
    
}
