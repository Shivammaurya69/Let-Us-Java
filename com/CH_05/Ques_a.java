package com.CH_05;

import java.util.Scanner;

public class Ques_a {
    public static void main(String[] args) {
       int num, i, factorial=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        num= sc.nextInt();
        for (i=1; i<=num; i++) {
        factorial = factorial * i;
        }
            System.out.println("factorial  " + factorial);
    }
}
