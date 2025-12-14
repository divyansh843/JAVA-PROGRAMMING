import java.util.Scanner;

public class Fundamental {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        
        

        for (int i = 1; i <= 10 ; i++) {
             int table = n*i; 
            System.out.print(table + " ");  
        }
        System.out.print("\n");

        for (int i = n; i >= 1; i--){
            fact = fact*i;
                
        }
        System.out.print(fact + "\n");

        

        
    }
    
}
