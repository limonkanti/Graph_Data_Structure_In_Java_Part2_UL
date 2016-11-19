
package java_new_topics;

import java.io.RandomAccessFile;

public class RandomAccessFileTest
{
    public static void main(String[] args) {
        try
        {
            
            RandomAccessFile raf=new RandomAccessFile("F://l.txt","rw");
            String s="i am limon";
            raf.write(s.getBytes());
            raf.close();
        }
        catch(Exception e)
        {
            System.out.println("Error is"+e.toString());
        }
    }
}
