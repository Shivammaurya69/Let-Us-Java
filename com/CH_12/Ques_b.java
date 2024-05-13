package com.CH_12;

public class Ques_b {
    public static void main(String[] args) {
        String[] s = {
                "To err is human...",
                "But to really mess things up...",
                "One needs to know Java!!"
        };

        for (int i = 0; i < s.length; i++) {
            s[i] = new StringBuilder(s[i]).reverse().toString();
        }

        for (String str : s) {
            System.out.println(str);
        }
    }
}