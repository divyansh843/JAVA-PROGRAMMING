package MultiDimentionalArrays;
import java.util.Scanner;

public class factorial {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x[][] = new int[3][2];
    for (int i = 0; i < x.length; i++) {     // row
        for (int j = 0; j < x[i].length; j++) {     // column
            x[i][j] = sc.nextInt();
            
        }
        
    }

     for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                int fact = 1;
                for (int k = 1; k <= x[i][j]; k++) {
                    fact = fact * k; 
                }
                System.out.println("factorial of " + x[i][j] + " is = " + fact);
                
                
            }

     }

    }
}
