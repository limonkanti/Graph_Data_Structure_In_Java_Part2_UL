
package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;


public class BufferedReaderTest2
{
    public static void main(String[] args) 
    {
        try
        {
            InputStreamReader file=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(file);
            System.out.println("Enter your name....");
            String s;
            s=br.readLine();
            System.out.println("Your name is\t"+s);
            System.out.println("Enter your id....");
            int i;
            i=br.read();
            System.out.println("Your id is\t"+i);
            br.close();
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
       
        
    }
    
}
