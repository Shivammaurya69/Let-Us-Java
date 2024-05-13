package com.company;

import java.util.Scanner;

public class Reverse_numbers {
    public static void main(Ex_23[] args) {
        System.out.println("Enter five digit number you want to reverse :");
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int l5=a%10;
        int n1=a/10;
        int l4=n1%10;
        int n2=n1/10;
        int l3=n2%10;
        int n3=n2/10;
        int l2=n3%10;
        int n4=n3/10;
        int l1=n4%10;
        int n5=n4/10;

        System.out.println((l5*10000)+(l4*1000)+(l3*100)+(l2*10)+(l1));
    }
}
