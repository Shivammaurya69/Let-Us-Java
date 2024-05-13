package com.CH_11;

import java.util.Arrays;

public class Ques_d {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 9, 4, 5, 16, 17, 8, 9};
        int len = originalArray.length;
        int[] reversedArray = new int[len];
        for (int i=0; i<len; i++){
            reversedArray[i]=originalArray[len-i-1];
        }
        for (int i=0; i<len; i++){
            System.out.print(reversedArray[i]+",");
        }
    }
}