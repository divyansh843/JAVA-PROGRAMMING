//  Find the second largest element in the given array
import java.util.*;
public class FindSecondLargest {

    public static void main(String[] args) {

        int arr[] = {23, 45, 67 ,32, 34};

        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Max) {
                 Max = arr[i];
             
            }
            
        }
        System.out.println("Maximum element is " + Max);

        int SecMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != Max && arr[i] > SecMax) {
                 SecMax = arr[i];
             
            }
            
        }
        System.out.println("Second Maximum element is " + SecMax);
        
    }
    
}
