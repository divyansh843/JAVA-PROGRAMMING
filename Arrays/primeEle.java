import java.util.Scanner;

public class primeEle {

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;

        System.out.println("Enter 5 Elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();    
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

            int n = arr[i];
            

             if (n <= 1) {
             isPrime = false;  // Numbers less than or equal to 1 are not prime
        } else {
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    isPrime = false;
                    break;  // No need to check further
                }
            }
        }

        if (isPrime)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
            
        }


    }
    
}
