package com.CH_16;

import java.io.*;

interface ITransform{
    public char transform(char ch);
}
class Encrypt implements ITransform{
    String str = "khsgkjdfhgkjxhdfgkjshkfgjhskdjfghskjdhf";
    public char transform(char ch){
        if (Character.isLowerCase((char)ch))
            ch = str.charAt(ch - (char)'a');

        return ch;
    }
}
class Decrypt implements ITransform{
    String str = "khsgkjdfhgkjxhdfgkjshkfgjhskdjfghskjdhf";
    public char transform (char ch){
        if (Character.isLowerCase((char)ch))
            ch = (char) (str.indexOf((char)ch)+'a');

        return ch;
    }
}
class TransformWriter extends FilterWriter{
    private ITransform trans;
    public TransformWriter(Writer s, ITransform t){
        super(s);
        this.trans =t;
    }
    public void write (char[] buf, int off, int len){
        for(int i = off; i<off+len; i++)
            buf[i] = trans.transform(buf[i]);
        try {
            out.write(buf, off, len);
        }
        catch (IOException ex){
            System.out.println("IO Error");
        }
    }
}
public class Ex_08 {
    public static void main(String[] args) throws IOException {
        doEncDec("C:\\com.CH_15.a.txt", "enc.txt", true);
        doEncDec("enc.txt","dec.txt", false);
    }
    static void doEncDec(String source, String target, boolean isEncrypt) throws IOException{
        ITransform trans ;
        if (isEncrypt)
            trans = new Encrypt();
        else
            trans = new Decrypt();

        FileReader sstream=new FileReader(new File(source));
        BufferedReader sr=new BufferedReader(sstream);

        FileWriter tstream=new FileWriter(new File (target));
        TransformWriter tw= new TransformWriter(tstream, trans);
        BufferedWriter sw= new BufferedWriter(tw);

        String line;
        while((line = sr.readLine())!=null)
            sw.write(line="\r\n");

        sw.close();
        sr.close();
    }
}