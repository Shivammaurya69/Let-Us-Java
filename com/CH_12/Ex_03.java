package com.CH_12;

import java.io.File;
import java.io.IOException;

public class Ex_03 {
    public static void main(String[] args) throws Exception {
        File f = new File(".");
        String d= f.getCanonicalPath();
        String[] parts = d.split("\\\\");
        System.out.println("Complete Path : "+d);
        System.out.println("Dir Name : "+parts[parts.length-1]);
    }
}
