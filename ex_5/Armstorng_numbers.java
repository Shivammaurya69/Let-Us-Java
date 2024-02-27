package com.ex_5;

public class Ques_c {
    public static void main(String[] args) {
        int i, a, b, c;
        for(i=1;i<=500;i++)
        {
            a=i%10;
            b=i%100;
            b=(b-a)/10;
            c=i/100;
            if ((a*a*a)+(b*b*b)+(c*c*c)==i)
            {
                System.out.println(i);
            }
        }
    }
}
