package com.CH_10;

import java.util.*;

class Rectangle {
    private int len, brd;

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth.");
        len = sc.nextInt();
        brd = sc.nextInt();
    }

    public void setData(int l, int b) {
        len = l;
        brd = b;
    }

    public void displayData() {
        System.out.println("Length = " + len);
        System.out.println("Breadth = " + brd);
    }

    public void areaPeri() {
        int a, p;
        a = len * brd;
        p = 2 * (len + brd);
        System.out.println("Area = " + a);
        System.out.println("Perimeter = " + p);
    }
}

public class Ex_01 {
    public static void main(String[] args) {
        Rectangle r1, r2, r3;
        r1 = new Rectangle();
        r2 = new Rectangle();
        r3 = new Rectangle();

        r1.setData(10, 20);
        r1.displayData();
        r1.areaPeri();

        r2.setData(5, 8);
        r2.displayData();
        r2.areaPeri();

        r3.getData();
        r3.displayData();
        r3.areaPeri();
    }
}