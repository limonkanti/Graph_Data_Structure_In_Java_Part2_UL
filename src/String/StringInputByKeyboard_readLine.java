
package String;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class StringInputByKeyboard_readLine
{
    
     public static void main(String args[]) throws IOException 
     {
         DataInputStream input=new DataInputStream(System.in);
        
         System.out.println("Please enter your name:");
         
          String name=input.readLine();
         
          System.out.println("Your name is:\n"+name);
        //  System.out.println("Please enter the value of a:");
        //  int aa=input.readInt();
         ///  System.out.println("The value of a is"+aa);
         // System.out.println("Please enter a char:");
        //  char c=input.readChar();
        //   System.out.println("The char is"+c);
          System.out.println("Please enter 2 names:");
          String a[]=new String[2];
          for(int i=0;i<a.length;i++)
          {
              a[i]=input.readLine();
          }
          System.out.println("You have entered :");
          for(int i=0;i<a.length;i++)
          {
              System.out.println(a[i]);
          }
          //sometimes compilers shows error using DataInputStream class //so we used BufferedReader class
          
          System.out.println("Please enter your name:");
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          String inputbr=br.readLine();
          
          System.out.println("Your name is:\n"+inputbr);
          
          
          
     }
}
