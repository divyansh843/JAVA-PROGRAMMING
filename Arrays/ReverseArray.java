// Write a program to revrse an array without using any extra array.

import java.util.Arrays;
public class ReverseArray {

    public static void main(String[] args) {
        int arr[] = {10, 98, 45, 40, 56, 87, 70};
        int n = arr.length;
        Arrays.sort(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");           
        }
        System.out.println();

        // for (int i = 0; i < n/2; i++) {
        //     int j = n-1-i;
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        // }

        // Two pointer approch

        int i = 0;
        int j = n-1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;        
        }

        for (int ele : arr) {
            System.out.print(ele + " ");           
        }
    }
}