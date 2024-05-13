package com.CH_12;

import java.util.Arrays;

public class Ques_a {
    public static void main(String[] args) {
        String[] str = {
                "We will teach you how to...",
                "Move com.CH_15.a mountain",
                "Erase the past",
                "Make com.CH_15.a million",
                "... all through java!!"
        };
        String str1 = "mountain";
        String str2 = "car";
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains(str1)) {
                str[i] = str[i].replace(str1, str2);
            }
        }
        for (String s : str) {
            System.out.println(s);
        }
    }
}