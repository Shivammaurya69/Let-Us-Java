package com.CH_07;

import java.util.Scanner;

public class Ques_d {
    public static void main(String[] args) {
        float n1, value;
        int n2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers to finds it's product.");
        n1= sc.nextFloat();
        n2= sc.nextInt();
        value= product(n1,n2);
        System.out.println(value);
    }
    static float product(float x, int y){
        float multiplication;
        multiplication=x*y;
        return (multiplication);
    }
}
