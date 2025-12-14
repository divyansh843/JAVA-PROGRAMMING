import java.util.*;

public class 2DARRAY {
    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        // output
        for (int i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();

        }
    }
}