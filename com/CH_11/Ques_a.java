package com.CH_11;

import java.util.Scanner;

public class Ques_a {
    public static void main(String[] args) {
        int[] a = new int[25];
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 25 numbers for array.");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+", ");
        }
        System.out.println(" ");
        System.out.println("Enter the number you want to search in array.");
        int searchNumber= sc.nextInt();
        for (int number : a){
            if (number==searchNumber){
                count++;
            }
        }
        if (count>0){
            System.out.println(searchNumber+" is present in the array "+count+" times.");
        }
        else {
            System.out.println(searchNumber+" is not present in the array.");
        }
    }
}
