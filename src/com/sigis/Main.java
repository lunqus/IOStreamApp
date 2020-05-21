package com.sigis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("src/Test.txt");

        try(FileInputStream fis = new FileInputStream(file)) {

            System.out.println("Total size in bytes: " + fis.available());

            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

//        byte[] data = new byte[11];
//
//        System.out.println(" Enter some characters: ");
//        System.in.read(data);
//
//        System.out.println(" You entered: ");
//
//        for (int i = 0; i < data.length; i++) {
//            System.out.print((char)data[i]);
//        }
    }
}
