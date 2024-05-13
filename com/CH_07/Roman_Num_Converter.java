package com.CH_07;

import java.util.Scanner;

public class Roman_Num_Converter {
    public static void main(String[] args) {
        int yr;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year");
        yr= sc.nextInt();
        yr =romanise(yr, 1000, 'm');
        yr =romanise(yr, 500, 'd');
        yr =romanise(yr, 100, 'c');
        yr =romanise(yr, 50, 'l');
        yr =romanise(yr, 10, 'x');
        yr =romanise(yr, 5, 'v');
        yr =romanise(yr, 1, 'i');
    }
    static int romanise(int y,int k,char ch){
        int i, j;
        j= y/k;
        for (i=1;i<=j;i++){
            System.out.print(ch);
        }
        return (y%k);
    }
}
