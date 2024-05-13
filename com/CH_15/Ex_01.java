package com.CH_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_01 {
    public static void main(String[] args) {
        int num;
        while (true) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter com.CH_15.a number :");
                num = Integer.parseInt(br.readLine());
                break;
            }
            catch (IOException e){
                System.out.println("Error in inputI");
            }
            catch (NumberFormatException e){
                System.out.println("Incorrect Input");
            }
        }
        System.out.println("You entered :"+num);
    }
}