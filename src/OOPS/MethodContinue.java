
package OOPS;


public class MethodContinue 
{
    
    
    int f=1,i=1;
    
    void continueTest(int a)
    {
        loop1: for(i=1;i<=a;i++)
       {
           if(i%2==0)
               continue;
           System.out.println(i);
       }
      
        
    }
   public static void main(String args[])
    {
        
        MethodContinue ob=new MethodContinue();
        ob.continueTest(10);
        
        
    }
}
