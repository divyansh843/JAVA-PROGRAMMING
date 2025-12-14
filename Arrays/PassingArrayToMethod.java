// Passing Arrays to mathod

import java.util.*;

public class PassingArrayToMethod {

    public static void change(int x[]){
        x[0] = 54;

    }

    public static void main(String[] args) {
        int arr[] = {10, 34, 56, 32};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);

        
    }
    
}
