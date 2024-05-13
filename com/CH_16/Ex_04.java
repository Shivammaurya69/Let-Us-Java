package com.CH_16;

import java.io.*;
import java.util.stream.Stream;

public class Ex_04 {
    public static void main(String[] args) {
        int i = 123456;
        try{
            rawWrite(i);
            charWrite(i);
            unicodeWrite(i);
        }
        catch(IOException e){
            System.out.println(" IO Error");
        }
    }
    static void rawWrite(int i) throws IOException{
        DataOutputStream ds = new DataOutputStream(new FileOutputStream("Stream.txt"));
        ds.writeInt(i);
        ds.close();
        System.out.println("Wrote 123456 as an integer");
        System.out.println("Length of file =");
        System.out.println(new File ("Stream.txt").length());
    }
    static void charWrite(int i) throws IOException{
        FileWriter fw = new FileWriter(new File("Char.txt"));
        fw.write(((Integer)i).toString());
        fw.close();
        System.out.println("Wrote 123456 as com.CH_15.a string");
        System.out.println("Length of file =");
        System.out.println(new File ("Char.txt").length());
    }
    static void unicodeWrite(int i) throws IOException{
        OutputStreamWriter ow = new OutputStreamWriter(new FileOutputStream("CharU.txt"),"UTF-16");
        ow.write(((Integer)i).toString());
        ow.close();
        System.out.println("Wrote 123456 as com.CH_15.a unicode string");
        System.out.println("Length of file =");
        System.out.println(new File ("CharU.txt").length());
    }
}