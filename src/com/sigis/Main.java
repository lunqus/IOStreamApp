package com.sigis;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        // Create file
        File createFile = new File("src/cFile.txt");

        try(FileWriter fw = new FileWriter(createFile)) {

            fw.write("This is the text to be written into the given file ...");

        } catch (IOException e){
            e.printStackTrace();
        }

        // Read from file
        FileReader fr = new FileReader(createFile);
        BufferedReader br = new BufferedReader(fr);

        String line = null;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        System.out.println("----=====-----");

        // Pointing to existing file
        File file = new File("src/Test.txt");

        // Read from console
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
