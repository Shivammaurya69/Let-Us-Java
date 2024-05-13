package com.CH_16;

import java.io.File;
import java.io.FileFilter;

public class Ex_02 {
    public static void main(String[] args) {
        File d;
        d = new File(".");
        ListFiles(d, "");
    }

    static void ListFiles(File d, String indent) {
        String str;
        System.out.println(indent + d.getName() + "/");
        for (File fi : d.listFiles()) {
            str = indent + " " + fi.getName();
            System.out.println(str);
        }
        FileFilter dirFilter = new FileFilter() {
            public boolean accept(File file) {
                return file.isDirectory();
            }
        }
//        Why it is showing an error for not using this semicolon.
        ;
        for (File di : d.listFiles(dirFilter))
            ListFiles(di, indent+" ");
    }
}