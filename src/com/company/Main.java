package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        try {
            System.out.println("Input n: ");
            n = sc.nextInt();
            if (n <= 0) throw new IllegalArgumentException("Array size must be positive.");
            int[][] matrix = new int[n][n];
            System.out.println("Input matrix (" + n + "*" + n + "):");
            for(int i = 0; i < n; i++) {
                for (int j=0; j < n; j++) {
                    System.out.println("[" + i + "," + j + "]: ");
                    matrix[i][j] = sc.nextInt();
                }
            }

            /*for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    matrix[i][j] = i * n + j + 1; */
            System.out.println("Matrix in a spiral: ");
            Manually.spiralize(n, matrix);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
