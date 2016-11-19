package Map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        Properties p = new Properties();
        FileReader fis=new FileReader("F:\\Java\\Java_Programs\\src\\Map\\db.properties");
       // new FileReader("F:\\Java\\Java_Programs\\src\\Map\\db.properties");
        p.load(fis);
        System.out.println(p.getProperty("name"));
        fis.close();
          

    }
}
