
package java_nio_pkg;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;


public class ReadTestUsingMappedfile 
{
    public static void main(String[] args) {
       try
        {
            RandomAccessFile raf=new RandomAccessFile("F://test.txt","rw");
            FileChannel fc=raf.getChannel();
            long size=fc.size();
            ByteBuffer bf=fc.map(FileChannel.MapMode.PRIVATE.READ_ONLY,0,size);
            //or
            // MappedByteBuffer bf=fc.map(FileChannel.MapMode.PRIVATE.READ_ONLY,0,size);
            for(int i=0;i<size;i++)
            {
                System.out.print((char)bf.get());
                
            }
            raf.close();
            fc.close();
            System.out.println();
            System.out.println("Success!!!!");
            
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
}
