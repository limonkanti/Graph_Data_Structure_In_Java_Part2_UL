
package StringProgramms;


public class StringSearchLastOccu
{
    
    public static void main(String[] args) {
        String s="Hello Java , I love Java";
        int lastOccurence=s.lastIndexOf("Java");
        if(lastOccurence>0)
        {
            System.out.println("Found position\t"+lastOccurence);
        }
        else
        {
            System.out.println("Not found");
        }
       
    }
    
}
