package com.CH_11;

import java.util.Scanner;

public class Ques_b {
    public static void main(String[] args) {
        int[] a = new int[25];
        int evenCount = 0, oddCount = 0, positiveCount = 0, negativeCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 25 numbers for array.");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(" ");
        for (int number : a) {
            if (number > 0) {
                positiveCount++;
            }
        }
        for (int number : a) {
            if (number < 0) {
                negativeCount++;
            }
        }
        for (int number : a) {
            if (number % 2 == 0) {
                evenCount++;
            }
        }
        for (int number : a) {
            if (number % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("There are "+positiveCount+" positive number in the array.");
        System.out.println("There are "+negativeCount+" negative number in the array.");
        System.out.println("There are "+evenCount+" even number in the array.");
        System.out.println("There are "+oddCount+" odd number in the array.");
    }
}