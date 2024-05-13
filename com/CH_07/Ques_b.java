package com.CH_07;

import java.util.Scanner;

public class Ques_b {
    public static void main(String[] args) {
        double base, power, result;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of base");
        base= sc.nextDouble();
        System.out.println("Enter the value of power");
        power= sc.nextDouble();
        result=calPower(base, power);
        System.out.println(result);
    }
    static double calPower(double x,double y){
        double value;
        value= Math.pow(x,y);
        return (value);
    }
}
