package com.CH_08;

import java.util.Scanner;

public class Ques_c {
    public static void main(String[] args) {
        int num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter com.CH_15.a five digits number.");
        num = sc.nextInt();
        sum = calSum(num);
        System.out.println(sum);
    }

    static int calSum(int x) {
        int r;
        if (x == 0)
            return 0;
        else {
            r = x % 10 + calSum(x/10);
        }
        return r;
    }
}
