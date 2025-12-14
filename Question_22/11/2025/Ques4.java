class login {
    String username = "Admin";
    int password = 123;

    public void login(String username, int password){
        if (username.equalsIgnoreCase(this.username) && password == this.password) {
            System.out.println("login succesful");
            
        }else{
            System.out.println("incorrect password or username");
        }
    }

}
public class Ques4 {

    public static void main(String[] args) {
        login l = new login();
        l.login("Admin", 1);
    }

    
}
