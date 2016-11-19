

package OOPS;


public class MethodVarargs
{
    
    void forEachLoopTest(String ...s)
    {
      for(String x:s)
      {
          System.out.println(x);
      }
      
        
    }
   public static void main(String args[])
    {
        
        MethodVarargs ob=new MethodVarargs();
        ob.forEachLoopTest("i","love","java");
        
        
    }
}
