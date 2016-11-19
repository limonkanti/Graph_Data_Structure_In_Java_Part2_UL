
package InnerClasas;

interface Eatable
{
    void eat();
}

public class AnnonymousTest 
{
    public static void main(String[] args) 
    {
        Eatable ob=new Eatable()
        {

            
            public void eat() 
            {
                System.out.println("i eat rice");
            }
            
        };
        ob.eat();
       
    }
    
}
