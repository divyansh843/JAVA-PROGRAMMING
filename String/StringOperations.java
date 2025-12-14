import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {
        String a = "Divyansh";
        System.out.println(a.substring(4));
        System.out.println(a.substring(3, 6));

        // Que1: Input a string and print all the substrings of that string
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                System.out.print(str.substring(i, j) + " ");
                
            }
            System.out.println();
            
        }
    }
    
}
