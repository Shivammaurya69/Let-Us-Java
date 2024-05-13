package com.CH_08;

public class Ques_e {
    public static void main(String[] args) {
        for (int i = 1; i < 25; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
