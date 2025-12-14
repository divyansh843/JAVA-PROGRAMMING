import java.util.*;

public class spiralmatrix {
    public static void spiral(int matrix[][]) {
        int startrow = 0;
        int endrow = matrix.length - 1;
        int startcol = 0;
        int endcol = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {
            // Top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }
            // right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");

            }

            // bottom
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }
            // right
            for (int i = endrow - 1; i >= startrow; i--) {
                System.out.print(matrix[i][startcol] + " ");
            }
            startrow++;
            startcol++;
            endcol--;
            endrow--;
        }
    }

    public static int diagonalsum(int matrix[][]) {
        int sum = 0;
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j) {
        // sum += matrix[i][j];
        // } else if (i + j == matrix.length - 1) {
        // sum += matrix[i][j];

        // }
        // }

        // }

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

    public static boolean Staircasesearsch(int matrix[][], int key) {

        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("key found at" + "(" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String args[]) {
        // int matrix[][] = { { 1, 2, 3, 4 },
        // { 5, 6, 7, 8, },
        // { 9, 10, 11, 12 },
        // { 13, 14, 15, 16 } };
        // // spiral(matrix);
        // System.out.println(diagonalsum(matrix));

        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 33;
        Staircasesearsch(matrix, key);
    }

}
