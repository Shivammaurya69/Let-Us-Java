package com.CH_08;

public class Ex_02 {
    public static void main(String[] args) {
        double d1, d2, d3, d4;
        d1 = 10.0;
        d2 = 20.0;
        d3 = 30.0;
        d4 = 40.0;
        System.out.printf("Avg= %f\n", average(d1, d2));
        System.out.printf("Avg= %f\n", average(d1, d2, d3));
        System.out.printf("Avg= %f\n", average(d1, d2, d3, d4));
    }
    static double average(double... numbers){
        double total =0.0;
        for (double d:numbers)
            total =total+d;
        double avg;
        avg= total/numbers.length;
        return avg;
    }
}
