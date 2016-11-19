
package java_nio_pkg;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
public class WriteTestUsingMappedfile 
{
    public static void main(String[] args) {
        try
        {
            RandomAccessFile raf=new RandomAccessFile("F://test.txt","rw");
            String s="i love java programming";
            byte b[]=s.getBytes();
            FileChannel fc=raf.getChannel();
            
            ByteBuffer bf=fc.map(FileChannel.MapMode.PRIVATE.READ_WRITE, 0,b.length);
            for(int i=0;i<b.length;i++)
            {
                bf.put(b[i]);
                
            }
            raf.close();
            fc.close();
            System.out.println("Success!!!!");
            
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
}
