
package Java8;

import java.util.Optional;


public class OptionalValue 
{
    public Integer sum(Optional<Integer> a,Optional<Integer> b)
    {
        Integer val1=a.orElse(new Integer(0));
        Integer val2=b.get();
        
        return val1+val2;
    }
    
    
    public static void main(String args[]) 
    {
        OptionalValue ob=new OptionalValue();
        Integer val1=null;
        Integer val2=new Integer(10);
        Optional<Integer> a=Optional.ofNullable(val1);
        Optional<Integer> b=Optional.of(val2);
        System.out.println(ob.sum(a, b));
        
    }
}
