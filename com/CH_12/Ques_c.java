package com.CH_12;

import java.util.Scanner;

public class Ques_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.replaceAll("a|e|i|o|u|A|E|I|O|U",""));
    }
}