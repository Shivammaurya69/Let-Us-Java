package com.CH_16;

import java.io.*;

public class Ex_05 {
    public static void main(String[] args) throws IOException {
        File f;
        f = new File ("D:\\DsiplayFileContents\\src\\displayfilecontents\\DisplayFileContents.java");
        if (f.exists()&&f.canRead()){
            BufferedReader br = null;
            try{
                br= new BufferedReader(new FileReader(f));
                String line ;
                while((line=br.readLine())!=null)
                    System.out.println(line);
            }
            catch (FileNotFoundException ex){
                System.out.println("Can't open "+f.getName());
            }
            finally {
                if (br!= null)
                    br.close();
            }
        }
    }
}
