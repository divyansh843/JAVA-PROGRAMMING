import java.util.*;
public class Basics {
    public static void main(String arg[]){
        int arr[] = new int[4];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i <= arr.length-1 ; i++) {
            arr[i] = sc.nextInt();
            
        }

        for(int i = 0; i <= arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
              
        System.out.println(arr.length);
    
    }
    
}
