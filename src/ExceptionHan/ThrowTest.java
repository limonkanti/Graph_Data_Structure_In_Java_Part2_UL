
package ExceptionHan;

public class ThrowTest 
{
    public static void test(int age) 
    {
        if(age<18)
        {
            throw new ArithmeticException("Sorry!!! you can't give vote");
        }
        else
        {
            System.out.println("Welcome!!!! you can give vote.......");
        }
        
    }
    public static void main(String[] args) 
    {
        
        try
        {
            test(2);
            
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("Rest of the code!!!!");
        
    }
    
}
