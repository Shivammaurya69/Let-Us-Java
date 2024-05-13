package com.CH_05;

import java.util.Scanner;

public class Ques_g {
    public static void main(String[] args) {
        int t_num, num, i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number.");
        t_num =sc.nextInt();
        num=t_num;
        for (i=1; i<=10; i++)
        {
            t_num=num*i;
            System.out.println(num+" * "+i+" = "+t_num);
        }
    }
}
