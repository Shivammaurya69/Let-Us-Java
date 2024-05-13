package com.CH_15;

import java.io.IOException;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        int number;
        Scanner  sc = new Scanner(System.in);
        number = sc.nextInt();
        String s= null;
        try {
            if (number < 0) {
                throw new IOException("Number cannot be negative");
            } else {
                System.out.println("Number is positive: " + number);
            }
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}
