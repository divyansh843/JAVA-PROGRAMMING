// Find the doublet in the array whose sum is equal to the given value x. (Two sum)

public class finddoubletnumber {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 7, 8};
        int x = 10;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println(arr[i] + " " + arr[j]);
                 
                }            
            }      
        }
    }  
}
