package com.CH_12;

public class Ques_f {
    public static void main(String[] args) {
        String text = "There is many books in the world please";
        String vowels = "aeiou";
        int count = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length()-1; i++) {
                if (vowels.indexOf(text.charAt(i)) != -1 && vowels.indexOf(text.charAt(i+1)) != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}