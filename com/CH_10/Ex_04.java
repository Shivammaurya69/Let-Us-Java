package com.CH_10;

import java.util.Scanner;

class Complex {
    private float real, imag;

    public Complex() {
    }

    public Complex(float r, float i) {
        real = r;
        imag = i;
    }

    public void getData() {
        float r, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real and imaginary part");
        r = sc.nextFloat();
        i = sc.nextFloat();
        real = r;
        imag = i;
    }

    public void setData(float r, float i) {
        real = r;
        imag = i;
    }

    public void displayData() {
        System.out.println("real = " + real);
        System.out.println("imaginary = " + imag);
    }

    public Complex addComplex(Complex y) {
        Complex t;
        t = new Complex();
        t.real = real + y.real;
        t.imag = imag + y.imag;
        return t;
    }

    public Complex mulComplex(Complex y) {
        Complex t;
        t = new Complex();
        t.real = real * y.real - imag * y.imag;
        t.imag = real * y.imag + y.real * imag;
        return t;
    }
}

public class Ex_04 {
    public static void main(String[] args) {
        Complex c1, c2, c3;
        c1 = new Complex();
        c1.setData(2.0f, 2.0f);
        c1.displayData();
        c2 = new Complex();
        c2.setData(3.0f, 3.0f);
        c3 = new Complex();
        c3 = c1.addComplex(c2);
        c2.displayData();
        System.out.println("Complex c3 :");
        c3.displayData();

        Complex c4, c5, c6;

        c4 = new Complex();
        c4.getData();
        c5 = new Complex(2.5f, 3.0f);
        c6 = new Complex();
        c6 = c4.mulComplex(c5);
        System.out.println("Complex c6 :");
        c6.displayData();

        Complex c7;
        c7 = new Complex();
        c7 = c1.addComplex(c2.mulComplex(c3));
        System.out.println("Complex c7 :");
        c7.displayData();
    }
}