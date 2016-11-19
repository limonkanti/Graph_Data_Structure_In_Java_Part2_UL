
package Multithread;

public class GarbageCollectionTest 
{
    protected void finalize()
    {
        System.out.println("Garbage collector");
    }
    public static void main(String[] args) 
    {
        
        GarbageCollectionTest ob=new GarbageCollectionTest();
        GarbageCollectionTest ob1=new GarbageCollectionTest();
        ob=null;
        ob1=null;
        System.gc();
        
    }
    
}
