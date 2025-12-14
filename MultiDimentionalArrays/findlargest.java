package MultiDimentionalArrays;

import java.util.Scanner;

public class findlargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                
            }
            
        }

        int max = arr[0][0];
        int min = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];  
                }

                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
            
        }
        System.out.println("maximun number is : " + max);
        System.out.println("manimun number is : " + min);

    }
    
}
