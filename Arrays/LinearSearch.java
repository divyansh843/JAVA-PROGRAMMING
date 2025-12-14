    // Find the element "x" in the array. Take array and x as input ;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size...");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Arrays Element...");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            
        }

        System.out.print("this is your array ... ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();

        System.out.print("Enter Your Target Element ... ");
        int key = sc.nextInt();

        boolean flag = false;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                flag = true;
                idx = i;
                break; 
            }
            
        }
        if (flag = true) {
            System.out.println("Element is found at the index " + idx);
            
        }else{
            System.out.println("Element not found");
        }


    }
    
}
