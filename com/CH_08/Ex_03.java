package com.CH_08;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        int a, fact;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter com.CH_15.a number.");
        a= sc.nextInt();
        fact= rec(a);
        System.out.println("Factorial = "+fact);
    }
    static int rec (int x)
    {
        int f;
        if (x==1){
            return 1;
        }
        else {
            f= x*rec(x-1);
            return f;
        }
    }
}
