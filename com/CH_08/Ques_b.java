package com.CH_08;

import java.util.Scanner;

public class Ques_b {
    public static void main(String[] args) {
        int a, b, c, d, e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers.");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        System.out.println(mini(a, b, c, d, e));
    }
    static int mini(int... numbers) {
        int mini = numbers[0];
        for (int num : numbers) {
            if (num < mini) {
                mini = num;
            }
        }
    return mini;}
}