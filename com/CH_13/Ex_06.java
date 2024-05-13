package com.CH_13;
class Shape{
    public double calculateArea(){
        return 0.0;
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(double r){
        radius=r;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape{
    private double length, width;

    public Rectangle(double l, double w){
        length=l;
        width=w;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }
}

public class Ex_06 {
    public static void main(String[] args) {
        Shape circle = new Circle(4);
        Shape rectangle = new Rectangle(12,26);
        System.out.println("Area Of Rectangle "+ rectangle.calculateArea());
        System.out.println("Area Of Circle "+ circle.calculateArea());
    }
}
