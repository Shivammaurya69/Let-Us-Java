package com.CH_05;

public class Ques_i {
    public static void main(String[] args) {
        double sum = 0;
        int fact = 1;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                fact *= i;
                sum += (double) i / fact;
            }}
            System.out.println("Sum of the first seven terms of the series: " + sum);
    }
}