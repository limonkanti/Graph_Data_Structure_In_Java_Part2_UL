
package designPattern;


public class Main 
{
    
    public static void main(String[] args)
    {
        
        FactoryClass ob=new FactoryClass();
        Shape s=ob.getShape("CIRCLE");
        s.draw();
    }
}
