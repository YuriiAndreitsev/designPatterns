package com.ua.structural.decorator.anotherExample;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Client {
    public static void main(String[] args) {
        int c;
        try {
            InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
            while ((c = inputStream.read()) >= 0) {
                System.out.print((char) c);
            }
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
    }
}
