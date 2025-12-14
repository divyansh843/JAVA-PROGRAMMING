import java.util.Scanner;

public class test {

    public static int checkVowelCon(String s){
        
        s = s.toLowerCase();
        int vowelCount = 0, consonantCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        return 0;
    }

    public static void main(String[] args) {
        checkVowelCon("Divyansh");
        // String s = "Divyansh";
        // String c = "";
        
        // for (int i = 0; i < s.length(); i++) {
        //     c += s.charAt(i);
            
        // }

        // System.out.println("Total character in string is : " + c.length());
        
    }
    
}
