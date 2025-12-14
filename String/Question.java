// Take input a string and count all the vowels in the given string.

import java.util.Scanner;

public class Question {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String vowels = "";


        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {

                vowels += ch;
            }
            
        }
        System.out.println("total vowels is " + vowels.length());
        System.out.println(vowels);
        
    }
    
}
