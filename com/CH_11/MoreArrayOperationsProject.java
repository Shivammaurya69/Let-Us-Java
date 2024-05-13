package com.CH_11;

import java.util.Arrays;

public class MoreArrayOperationsProject {

    public static void main(String[] args) {

        int[] arr = {23, 45, 11, 54, 89, 32};

        int i;
        System.out.println("Original array");
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        Arrays.sort(arr);
        System.out.println("\nSorted array");
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        int index = Arrays.binarySearch(arr, 54);
        System.out.println("\nElement 54 found at " + index);

        int[] newarr = new int[6];
        newarr = Arrays.copyOf(arr, arr.length);
        System.out.println("New array contents");
        for (i = 0; i < newarr.length; i++)
            System.out.print(newarr[i] + " ");

        Arrays.fill(arr, 0);
        System.out.println("\nCleared array");
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] +" ");
        System.out.println();
    }
}