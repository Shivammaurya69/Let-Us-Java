package com.CH_07;

import java.util.Scanner;

public class Example_03 {
    public static void main(String[] args) {
        int a,b,c,sum;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any three numbers");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        sum= calSum (a,b,c);
        System.out.println("Sum =" +sum);
    }
    static int calSum(int x, int y, int z)
    {
        int d ;
        d= x+y+z;
        return(d);
    }
}
