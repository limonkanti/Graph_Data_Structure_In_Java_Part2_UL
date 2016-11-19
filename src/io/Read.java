package io;

import java.io.*;
import java.io.ObjectOutputStream;

public class Read {

    public static void main(String[] args) throws Exception {
        FileInputStream write = new FileInputStream("F:/test.txt");
        ObjectInputStream oos = new ObjectInputStream(write);
        Student s = (Student) oos.readObject();
        System.out.println(s.id + "\t" + s.name);
        System.out.println("Done!!!");

    }

}
