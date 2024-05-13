package com.CH_07;

import java.util.Scanner;

public class Ques_a {
    public static void main(String[] args) {
        int a,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find it's Factorial.");
        a= sc.nextInt();
        num=fact(a);
        System.out.println(num);
    }
    static int fact(int f_num) {
        int i, factorial = 1;
        for (i = 1; i <= f_num; i++) {
            factorial = factorial * i;
        }
        return (factorial);
    }
}
