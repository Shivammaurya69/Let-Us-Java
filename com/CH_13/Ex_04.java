package com.CH_13;

class base1 {
    protected int i;

    public base1() {
        i = 4;
    }
}

class der extends base1 {
    private int j;
    public der(){
        j=i*4;
    }
}

public class Ex_04 {
    public static void main(String[] args) {
        der d = new der();
        System.out.println(d);
    }
}
