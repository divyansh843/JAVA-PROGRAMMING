import java.util.*;

public class largestNumber {
    public static int getlargest(int Numbers[]) {
        int largest = Integer.MIN_VALUE; // -INFINITY
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < Numbers.length; i++) {
            if (largest < Numbers[i]) {
                largest = Numbers[i];
            }
            if (smallest > Numbers[i]) {
                smallest = Numbers[i];
            }
        }
        System.out.println("smallest number is : " + smallest);
        System.out.println("largest number is : " + largest);
        return largest;
    }

    public static void main(String args[]) {
        int Numbers[] = { 1, 2, 6, 3, 5 };
        getlargest(Numbers);
    }

}
