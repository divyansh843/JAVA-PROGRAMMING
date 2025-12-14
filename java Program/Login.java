import java.util.*;

public class Login {
 public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
System.out.println("Enter the User name and Password");
String nm = s.nextLine();
 String pwd = s.nextLine();
if(nm.equalsIgnoreCase("Ram") && pwd.equalsIgnoreCase("Sita")) {
   System.out.println("Login Successful");
    } else {
   System.out.println("Invalid login");
        }
    }
}
