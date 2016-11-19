
package io;

import java.io.*;


public class BufferedReaderTest 
{
    public static void main(String[] args) 
    {
        try
        {
            FileReader file=new FileReader("F:/f.txt");
            BufferedReader bf=new BufferedReader(file);
            String s;
            while((s=bf.readLine())!=null)
            {
                System.out.println(s);
            }
            bf.close();
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
       
        
    }
    
}
