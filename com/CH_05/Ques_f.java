package com.CH_05;

public class Ques_f {
    public static void main(String[] args) {
        int y;
        float x,i;
        for (y=1; y<=6; y++)
        {
            for (x=5.50f; x<=12.50f; x+=0.50f) {
                i= (float) (2+(y+0.50*x));
                System.out.println("i = "+i+",       x = "+x+",         y = "+y);
            }
        }
    }
}