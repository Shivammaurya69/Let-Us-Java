package com.CH_06;

import java.util.Scanner;

public class Ques_C {
    public static void main(String[] args) {
        int caseSelector;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number according to your need.");
        System.out.println("1. Factorial of com.CH_15.a number.");
        System.out.println("2. Prime or not.");
        System.out.println("3. Odd or Even.");
        System.out.println("4. Exit.");
        caseSelector =sc.nextInt();
        switch (caseSelector){
            case 1: int num, i, factorial=1;
                System.out.println("Enter the number");
                num= sc.nextInt();
                for (i=1; i<=num; i++) {
                    factorial = factorial * i;
                }
                System.out.println("factorial  " + factorial);
                break;
            case 2:
                int p_num, j;
                System.out.println("Enter com.CH_15.a number for checking it is prime or not");
                p_num =sc.nextInt();
                    for (j=2; j<p_num; j++)
                    {
                        if (p_num%j==0)
                            break;
                    }
                    if (p_num==j)
                        System.out.println(p_num+"  It is com.CH_15.a Prime number.");
                    else
                        System.out.println(p_num+"  It is not com.CH_15.a Prime number.");
                    break;
            case 3:
                int numCase3;
                System.out.println("Enter the number for checking it is even or odd");
                numCase3 =sc.nextInt();
                if (numCase3%2==0){
                    System.out.println(numCase3+"  It is an Even number");
                }
                else {
                    System.out.println(numCase3+"  It is an Odd number");
                }
                break;
            case 4:
                System.out.println("Exit");
            default:
                System.out.println("Enter com.CH_15.a valid number");
                break;
        }
    }
}
