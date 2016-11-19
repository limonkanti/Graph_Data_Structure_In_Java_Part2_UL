
package Reflection;
class Simple{
    void disPlay()
    {
       System.out.println("Hello......");
    }
    
}
public class GetClassObject 
{
    public static void main(String args[]) 
    {
        try
        {
           //  Class c=Class.forName("Simple");
            // System.out.println(c.getName());
             Class cc=Simple.class;
             Simple s=(Simple)cc.newInstance();
             s.disPlay();
             
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
       
    }
    
    
}
