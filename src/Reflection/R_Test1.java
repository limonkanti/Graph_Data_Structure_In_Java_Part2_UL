
package Reflection;

import java.lang.reflect.*;


public class R_Test1 
{
    public static void main(String args[]) 
    {
        try
        {
             Class c=java.lang.String.class;
             
            Constructor m=c.getConstructors()[0];
            String name=m.getName();
        System.out.println(name);
       // System.out.println(c.getSuperclass());
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
       
    }
    
}
