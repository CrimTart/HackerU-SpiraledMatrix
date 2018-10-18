package com.company;

public class Manually {

    public static void spiralize(int n, int[][] orig) {
        //Coordinates in a resulting matrix
        int row = 0;
        int col = 0;

        //Cardinal direction in which the spiral is coiling.
        //From top left: left to right, up to down, right to left, down to up, repeat.
        //Corresponding (dx, dy): (1,0), (0,1), (-1,0), (0,-1).
        int dx = 1;
        int dy = 0;

        //Number of times direction was changed.
        //Indicates which spiral coil we are on now.
        int dirChanges = 0;

        //How many elements are left before it's time to redirect.
        //See formula for each redirection below.
        int remains = n;

        //Resulting matrix.
        int[][] spiraled = new int[n][n];

        for (int i = 0; i < n * n; i++) {
            spiraled[row][col] = orig[i / n][i % n];
            remains--;
            if (remains == 0) {
                remains = n - dirChanges / 2 - 1;
                int temp = dx;
                dx = -dy;
                dy = temp;
                dirChanges++;
            }
            col += dx;
            row += dy;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(spiraled[i][j] + "\t");
            System.out.println();
        }
    }
}
