import java.util.Scanner;

public class StringQues {

    public static void CheckUsername(String username){
        int n = username.length();
        if (n >= 6){
            System.out.println("Username is valid");
        }else{
            System.out.println("Enter Valid Username");
        }

    }

    public static void CheckUrl(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your url");
        String url = sc.nextLine();
  
        if (url.startsWith("https:") && url.endsWith(".com")) {
            System.out.println("Your gmail is valid");            
        }else{
            System.out.println("Enter Valid url");
        }

    }

    public static void CheckEmail(String Email){
        if(Email.contains("@") && Email.endsWith(".com")){
            System.out.println("Your Email is valid");
        }else{
            System.out.println("Enter valid Email");
        }

    }

    public static void CheckFileType(String file){
        if (file.endsWith(".png") || file.endsWith(".jpg")) {
            System.out.println("This is a image file");
            
        }else{
            System.out.println("This is not a image file");
        }


    }

    public static boolean StrongPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Password length is sort");
        }

        boolean hasUppercase = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
                
            } 
            if (Character.isDigit(ch)) {
                hasDigit = true;
                
            }
        }

        return hasUppercase && hasDigit;
    }


    public static void main(String[] args) {
        CheckUsername("Divyansh");
        CheckUrl();
        CheckEmail("xyz@gmail.com");
        CheckFileType("image.jpg");
        boolean password = StrongPassword("Xyz123456");

        if (password == true) {
            System.out.println("Password is strong");
        }
           
    }
    
}
