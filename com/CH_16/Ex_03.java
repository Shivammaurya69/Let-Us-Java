package com.CH_16;

import java.io.File;

public class Ex_03 {
    public static void main(String[] args) {
        for(File d: File.listRoots()){
            System.out.println("Drive = "+d);
            System.out.println(("Total Space = "+d.getTotalSpace()));
            System.out.println(("Free Space = "+d.getFreeSpace()));
            System.out.println("");
        }
    }
}
