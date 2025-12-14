package MultiDimentionalArrays;

import java.util.Scanner;

public class table {

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
                System.out.print("table of " + x[i][j] + " is = ");
                for (int k = 1; k <= 10; k++) {
                    int table = 0;
                    table = k * x[i][j]; 
                    System.out.print(table + " ");
                }
                System.out.println();
                
            }

     }

    }
}

