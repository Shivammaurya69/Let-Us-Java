package com.CH_10;
class Example{
    private int data;
    public Example(){
        System.out.println("Inside the constructor");
    }
    protected void finalize() throws Throwable{
        super.finalize();
    }
}
public class Ex_03 {
    public static void main(String[] args) {
        Example e= new Example();
    }
}
