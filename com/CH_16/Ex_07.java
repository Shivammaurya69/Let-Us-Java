package com.CH_16;
import java.io.*;

class UppercaseFilterReader extends FilterReader{
    public UppercaseFilterReader(Reader s){
        super(s);
    }
    public int read (char[] cbuf, int off, int count) throws IOException{
        int nb = in.read(cbuf, off, count);

        for(int i = off; i<off+nb; i++)
            cbuf[i] = transform(cbuf[i]);

        return nb;
    }
    private char transform(char ch){
        if (Character.isLowerCase(ch))
            return Character.toUpperCase((char)ch);
        return ch;
    }
}
public class Ex_07 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("D:\\com.CH_15.a.txt");
        if (f.exists()) {
            UppercaseFilterReader ufr;
            BufferedReader br;

            ufr = new UppercaseFilterReader(new FileReader("D:\\com.CH_15.a.txt"));
            br = new BufferedReader(ufr);
            String line;
            while ((line = br.readLine()) != null) ;
            System.out.println(line);

            br.close();
            ufr.close();
        }
    }
}