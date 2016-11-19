package io;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Persist {

    public static void main(String[] args) throws Exception {
        FileOutputStream write = new FileOutputStream("F:/test.txt");
        ObjectOutputStream oos = new ObjectOutputStream(write);
        Student s = new Student(11205061, "Limon Kanti Dey");
        oos.writeObject(s);
        oos.close();
        System.out.println("Done!!!");

    }
}
