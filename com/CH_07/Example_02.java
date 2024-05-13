package com.CH_07;

public class Example_02 {
    public static void main(String[] args) {
        System.out.println("I am in main");
        italy();
        System.out.println("I am finally back in main");
    }
    static void italy(){
        System.out.println("I am in Italy");
        brazil();
        System.out.println("I am  back in Italy");
    }
    static void brazil() {
        System.out.println("I am in Brazil");
        argentina();
    }
    static void argentina(){
        System.out.println("I am in Argentina");
    }
}
