
package OOPS;

public class SingletonClass {
    private static SingletonClass ob=new SingletonClass();
    private SingletonClass()
    {
        
    }
    public static SingletonClass getSingletonClass()
    {
        return ob;
    }
    void disPlay()
    {
        System.out.println("My singleton class");
    }
    
    public static void main(String args[])
    {
        SingletonClass ob=getSingletonClass();
        ob.disPlay();
    }
    
}
