
package ExceptionHan;

import java.io.FileInputStream;
import java.io.FileReader;


public class TryWithResources
{
    
    public static void main(String[] args) {
        try(FileInputStream fr=new FileInputStream("F://f.txt"))
        {
            int i=0;
            String str;
           while((i=fr.read())!=-1)
            {
                System.out.print((char)i+"\t");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
