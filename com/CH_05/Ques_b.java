package com.CH_05;

import java.util.Scanner;

public class Ques_b {
    public static void main(String[] args) {
        double base, exponent;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers.");
        base= sc.nextDouble();
        exponent= sc.nextDouble();
        System.out.println(Math.pow(base, exponent));
    }
}
