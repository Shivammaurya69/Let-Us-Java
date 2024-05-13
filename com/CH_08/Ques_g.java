package com.CH_08;

public class Ques_g {
    public static void main(String[] args) {
        for (int i = 1; i <= 25; i++) {
            System.out.print(naturalsum(i) + " ");
        }
    }

    static int naturalsum(int n) {
        if (n == 1) {
            return n;
        }
        return n+ naturalsum(n - 1);
    }
}
