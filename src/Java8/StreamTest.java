
package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamTest 
{
    public static void main(String args[])
    {
        List<String> s=Arrays.asList("Alo","Ali","","");
        List<String> fil=s.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
        
        System.out.println(fil);
    }
    
}
