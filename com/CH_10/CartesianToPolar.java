package com.CH_10;

import java.util.Scanner;

class Cartesian {
    private double x, y;

    public void setData(double a, double b) {
        x = a;
        y = b;
    }

    public void getData() {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cartesian Co-Ordinates x & y respectively.");
        a = sc.nextDouble();
        b = sc.nextDouble();
        a = x;
        b = y;
    }

    public void toPolar() {
        double r = Math.sqrt(x * x + y * y);
        double theeta = Math.atan2(y, x);
        System.out.println("r :" + r);
        System.out.println("Theeta :" + theeta);
    }
}

class Polar {
    private double r, theeta;

    public void setData(double c, double d) {
        r = c;
        theeta = d;
    }

    public void getData() {
        double c, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Polar Co-Ordinates r & theeta respectively.");
        c = sc.nextDouble();
        d = sc.nextDouble();
        c = r;
        d = theeta;
    }

    public void toCartesian() {
        double x = r * Math.cos(theeta);
        double y = r * Math.sin(theeta);
        System.out.println("x :" + x);
        System.out.println("y :" + y);
    }
}

public class CartesianToPolar {
    public static void main(String[] args) {
        Cartesian c1 = new Cartesian();
        Polar p1 = new Polar();
        c1.setData(3, 8);
        c1.toPolar();
        p1.setData(8.5, 9);
        p1.toCartesian();
    }
}
