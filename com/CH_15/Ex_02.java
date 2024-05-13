package com.CH_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_02 {
    public static void main(String[] args) {
        int num;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter com.CH_15.a number");
            num = Integer.parseInt(br.readLine());
            System.out.println("You entered :" + num);
        } catch (IOException e) {
            System.out.println("error in input");
        }
        catch (NumberFormatException e){
            System.out.println("Incorrect Input");
        }
    }
}
