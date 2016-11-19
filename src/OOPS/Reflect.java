
package OOPS;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

 class Reflect {
    private void message()
     {
         System.out.println("A........");
     }
    
}
class Main1
{
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException
    {
        Class c=Class.forName("Reflect");
        Object o=c.newInstance();
        Method m=c.getDeclaredMethod("message", null);
        m.setAccessible(true);
        m.invoke(o, null);
        
        
        
    }
}
