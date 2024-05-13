package com.CH_15;

import java.io.FileWriter;
import java.io.IOException;

public class Ex_04 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("com.CH_15.a.txt");
            fw.write("Hello World \n");
        }
        catch(IOException ie){
            System.out.println("Encountered IO Error");
        }
        finally {
            try{
                if (fw!= null){
                    fw.close();
                }
            }
            catch (IOException e){
                System.out.println("Error in input");
            }
        }
    }
}
