package com.CH_08;

import java.util.Scanner;

public class Ques_a {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers.");
        a = sc.nextInt();
        b = sc.nextInt();
        int result = max(a, b);
        System.out.println(result);
    }

    static int max(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }
    static float max(float x, float y) {
        if (x > y) {
            return x;
        }
        return y;
    }
    static double max(double x, double y) {
        if (x > y) {
            return x;
        }
        return y;
    }
}
