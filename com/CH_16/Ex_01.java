package com.CH_16;

import java.io.*;
import java.util.Date;

public class Ex_01 {
    public static void main(String[] args) throws Exception{
        String str ;
        try{
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter filename:");
            str = br.readLine();

            File f;
            f =new File(str);
            if (f.exists()){
                String dname = f.getParent();
                System.out.println("Directory Name: "+dname);
                String fname = f.getName();
                System.out.println("File Name: "+fname);
                String abspath = f.getAbsolutePath();
                System.out.println("Full Name: "+abspath);

                long size = f.length();
                System.out.println("Size :"+size);
                String ext;
                int dot = str.lastIndexOf(".");
                ext = str.substring(dot);
                System.out.println("Extension = "+new Date(f.lastModified()));
            }
        }
        catch(IOException e){
            System.out.println("Error in input");
        }
    }
}
