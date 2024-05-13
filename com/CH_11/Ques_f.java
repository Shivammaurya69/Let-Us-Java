package com.CH_11;

import java.util.Scanner;

public class Ques_f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] xCoordinates = new double[10];
        double[] yCoordinates = new double[10];

        //Formula = {(x_2-x_1)^2+(y_2-y_1)^2}

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter X coordinate for point " + (i + 1) + ": ");
            xCoordinates[i] = sc.nextDouble();
            System.out.print("Enter Y coordinate for point " + (i + 1) + ": ");
            yCoordinates[i] = sc.nextDouble();
        }

        double totalDistance = 0.0;
        for (int i = 0; i < 9; i++) {
            double dx = xCoordinates[i + 1] - xCoordinates[i];
            double dy = yCoordinates[i + 1] - yCoordinates[i];
            totalDistance += Math.sqrt(dx * dx + dy * dy);
        }

        System.out.println("Total distance from the first point to the last point: " + totalDistance);
    }
}