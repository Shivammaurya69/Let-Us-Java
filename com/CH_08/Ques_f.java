package com.CH_08;

import javax.swing.*;
import java.util.Scanner;

public class Ques_f {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Decimal to Binary converter");
        System.out.println("Enter com.CH_15.a number.");
        num = sc.nextInt();
        System.out.println(binary(num));
    }
    static int binary(int num){
        if (num==0){
            return 0;
        }
        else{
            return (num%2+10*binary(num/2));
        }
    }
}
