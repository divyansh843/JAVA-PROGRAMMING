// Copping of Arrays

import java.util.Arrays;

public class CopyOfArrays {

    public static void main(String[] args) {
        int arr[] = {24, 56, 78, 65};
        for (int ele : arr) {
            System.out.print(ele + " ");
            
        }
        System.out.println();

        int num[] = arr; // Shallow Copy
        num[1] = 90;
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
            
        }
        System.out.println();
        

        int brr[] = Arrays.copyOf(arr, arr.length); // Deep Copy
        brr[1] = 85;
        for (int ele : brr) {
            System.out.print(ele + " ");
            
        }
        
        // Second Method for deep copy
        int crr[] = new int[arr.length];
        for (int i = 0; i < crr.length; i++) {
            crr[i] = arr[i];
            
        }
        crr[0] = 100;
        System.out.println(arr[0]);
    }
    
}
