// Que : Find the maximun value out of the elements in the array

import java.util.*;
public class MaximumValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size...");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Arrays Element... ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            
        }

        System.out.print("this is your array ... ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();

        int max = Integer.MIN_VALUE;
        // int max = arr[0];
        for (int i = 0; i < n; i++) {
            // if (arr[i] > max) {
            //      max = arr[i];
             
            // }
            max = Math.max(max, arr[i]);
            
        }
        System.out.println("Maximum element is " + max);
 
        
    }
    
}
