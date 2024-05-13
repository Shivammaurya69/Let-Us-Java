package com.CH_10;

import java.util.Scanner;

class Number {
    private int i;

    public void setData(int j) {
        i = j;
    }

    public void getData() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any integer");
        i = scn.nextInt();
    }

    public Number() // zero argument constructor
    {
    }

    public Number(int j) // one argument constructor
    {
        i = j;
    }

    public void displayData() {
        System.out.println("Value of i =" + i);
    }
}

public class Ex_02 {
    public static void main(String[] args) {
        Number n1, n2, n3;
        n1 = new Number();
        n1.displayData();
        n1.setData(200);
        n1.displayData();

        n2 = new Number();
        n2.displayData();
        n2.getData();
        n2.displayData();

        n3 = new Number(100);
        n3.displayData();
    }
}
