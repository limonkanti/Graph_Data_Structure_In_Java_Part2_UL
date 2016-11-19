package java.net.pkg;

import java.io.*;
import java.net.*;
import java.net.Socket;

public class MyClient {

    public static void main(String[] args) throws Exception {
        Socket ss = new Socket("localhost", 6666);
        DataOutputStream dis = new DataOutputStream(ss.getOutputStream());
        dis.writeUTF("Hello i am client");
        ss.close();
        dis.close();

    }

}
