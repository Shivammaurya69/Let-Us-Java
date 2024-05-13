package com.company;

import java.util.Scanner;

public class Inter_Changing_value {
    public static void main(Ex_23[] args) {
        byte a,c,d;
        System.out.println("Enter the value of c and d :");
        Scanner sc = new Scanner(System.in);
        c= sc.nextByte();
        d= sc.nextByte();
        System.out.println("Values before interchanging :");
        System.out.println(c);
        System.out.println(d);
        a=c;
        c=d;
        d=a;
        System.out.println("Values after interchanging :");
        System.out.println(c);
        System.out.println(d);
    }
}