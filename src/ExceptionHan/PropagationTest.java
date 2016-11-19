
package ExceptionHan;


public class PropagationTest 
{
    void m()
    {
       
        try
        {
             int m=50/0;
        }
        catch(Exception e)
        {
            System.out.println("hhhhhh");
        }
    }
    void n()
    {
        m();
    }
    void p()
    {
        try
        {
            n();
        }
        catch(Exception e)
        {
            System.out.println("Handled");
        }
    }
    public static void main(String[] args)
    {
        
        PropagationTest ob=new PropagationTest();
        ob.p();
    }
    
}
