
package OOPS;

public class GenericMethodDemo 
{
    public static<E> void printArray(E[] elements)
    {
        for(E element:elements)
        {
            System.out.println(element);
        }
        
    }
    public static void main(String args[])
    {
        Integer a[]={1,2,3,4};
        printArray(a);
        
    }
    
}
