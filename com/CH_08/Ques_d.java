package com.CH_08;

import java.util.Scanner;

public class Ques_d {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter com.CH_15.a positive number.");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("\n Prime factors of " + num);
        fact(num, 2);
        sc.close();
    }

    static int fact(int num, int count) {
        if (num < 1) {
            return 0;
        }
        else if (num % count == 0) {
            System.out.println(count + " ");
            fact(num / count, count);
        }
        else fact(num, count+1);
        return num;
    }
}
