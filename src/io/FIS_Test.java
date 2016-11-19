package io;

import java.io.*;

public class FIS_Test {

    public static void main(String[] args) {
        try {

            FileInputStream fos = new FileInputStream("F:/a.txt");

            int i;
            while ((i = fos.read()) != -1) {
                System.out.print((char) i);
            }
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
