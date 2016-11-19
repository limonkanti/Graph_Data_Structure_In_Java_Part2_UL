
package InnerClasas;


public class LocalInnerClass
{
   private int data=50;
   void msg()
   {
         int a=50;
       class Inner{
           
           void display()
           {
                
               System.out.println(data+a);
           }
          
       }
      Inner i=new Inner();
        i.display();
   }
    
    
    public static void main(String[] args) 
    {
        
        LocalInnerClass ob=new LocalInnerClass();
        ob.msg();
    }
    
}
