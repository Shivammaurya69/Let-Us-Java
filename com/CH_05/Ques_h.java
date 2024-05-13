package com.CH_05;

import java.util.Scanner;

public class Ques_h {
    public static void main(String[] args) {
        float a, p, r, ci,n, q, b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount for Principle Amount, Rate %, Year, & times per year Respectively");
        p= sc.nextFloat();
        r= sc.nextFloat();
        n= sc.nextFloat();
        q= sc.nextFloat();
        a= (float) (p*(Math.pow((1+r/q),n)));
        System.out.println(a);
    }
}