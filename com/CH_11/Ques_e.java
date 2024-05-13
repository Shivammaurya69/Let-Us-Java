package com.CH_11;

import java.util.Scanner;

public class Ques_e {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println("Enter the matrix elements:");
        int[][] transpose = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        System.out.println("\nOriginal matrix:");
        printMatrix(matrix);

        System.out.println("\nTranspose matrix:");
        printMatrix(transpose);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}