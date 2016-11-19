
package StringBuffer;

public class IndexOf 
{
    public static void main(String args[])
     {
        StringBuffer sb=new StringBuffer("Limon Kanti Dey");
        String string="Limon Kanti Doy";
        //for char
        int index=string.indexOf('L');
        System.out.println(index);
        //for string 
        int index1=string.indexOf("kanti");
        System.out.println(index1);
        // after 5 char
        index=string.indexOf('o', 5);
        System.out.println(index);
        
         
         
     }
    
}
