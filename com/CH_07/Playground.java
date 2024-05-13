package com.CH_07;

public class Playground {
    public static void main(String[] args) {
        int i=44,c;
        c=check (i);
        System.out.println(c);
    }
    static int check(int ch)
    {
        if (ch>=45)
            return (100);
        else
            return (10);
    }
}
