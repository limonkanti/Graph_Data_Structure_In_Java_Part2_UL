
package java_nio_pkg;

import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;


public class WriteData 
{
    public static void main(String[] args) {
        try
        {
            RandomAccessFile fos=new RandomAccessFile("F://test.txt","rw");
            FileChannel filechannel=fos.getChannel();
            String s="i love java";
            byte by[]=s.getBytes();
           // fos.write(by);
          
            ByteBuffer bb=filechannel.map(FileChannel.MapMode.READ_WRITE, 0, by.length);
            for(int i=0;i<by.length;i++)
            {
                bb.put(by[i]);
               // bb.put((byte)('A'+i));
                
            }
            fos.close();
            filechannel.close();
            System.out.println("success");
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
