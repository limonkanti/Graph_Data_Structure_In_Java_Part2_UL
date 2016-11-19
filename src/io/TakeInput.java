
package io;

import java.io.*;


public class TakeInput
{
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a value");
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        String i=br.readLine();
        System.out.println("You have entered"+i);
        
        
    }
    
}
