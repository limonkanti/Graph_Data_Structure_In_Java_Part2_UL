
package OOPS;

public class MethodForEachLoop 
{
     
    
    void forEachLoopTest(int a[])
    {
       for(int x:a)
       {
          System.out.println(x);
       }
      
        
    }
   public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        MethodForEachLoop ob=new MethodForEachLoop();
        ob.forEachLoopTest(a);
        
        
    }
    
}
