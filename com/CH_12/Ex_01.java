package com.CH_12;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        String[] masterList = new String[]{
                "Akshay", "Parag", "Raman", "Srinivas", "Gopal", "Rajesh"
        };
        int i, a;
        boolean flag;
        String yourName ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name.");
        yourName= sc.nextLine();

        flag = false;
        for (i=0; i<=5; i++){
            a= masterList[i].compareTo(yourName);
            if (a==0){
                System.out.println("You can enter the palace");
                flag = true;
                break;
            }
        }
        if (flag==false)
            System.out.println("Sorry, you are com.CH_15.a trespasser");
    }
}
