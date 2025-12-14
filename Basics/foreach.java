import java.util.Scanner;

public class foreach {

    public static void main(String[] args) {

        String names[] = new String[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three names : ");

        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
            
        }

        for (String N : names) {
            String C = "";
            for (int i = N.length()-1; i >= 0; i--) {
                 C += N.charAt(i);
                
            }  
            System.out.println(C);
        
        }


    }
        }
