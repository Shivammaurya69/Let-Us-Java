package com.CH_11;

import java.util.Arrays;
import java.util.Scanner;

public class Ques_g {
    public static void main(String[] args) {
        int[][][] arr = {{{1, 2, 3, 4}, {6, 7, 8}, {8, 9}},
                        {{9, 9, 7}, {6, 3, 6, 4}}};
        System.out.println("jagged array");
        System.out.println("1st row" + Arrays.toString(arr[0][0]));
        System.out.println("2nd row" + Arrays.toString(arr[0][1]));
        System.out.println("3rd row" + Arrays.toString(arr[0][2]));
        System.out.println("second array");
        System.out.println("1st row" + Arrays.toString(arr[1][0]));
        System.out.println("2nd row" + Arrays.toString(arr[1][1]));
    }
}
