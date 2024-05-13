package com.CH_05;

import java.util.Scanner;

public class Ques_j {
    public static void main(String[] args) {
        float i, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter com.CH_15.a number.");
        x = sc.nextFloat();
        double sum = 0;
        double fx = (x-1)/x;
        for (i = 1; i <= 4; i++) {
            double term = Math.pow(fx,i);
            if (i==1){
                sum+= term;
            }
            else {
                sum+= term;
            }
        }
        System.out.println(sum);
    }
}
