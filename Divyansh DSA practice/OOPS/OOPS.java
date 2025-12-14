public class OOPS {

    public static void main(String args[]) {
        pen p1 = new pen(); // created a pen object called p1

        p1.SetColor("blue");
        System.out.println(p1.Color);
        p1.SetTip(5);
        p1.Color = "yellow";
        System.out.println(p1.Color);
        System.out.println(p1.Tip);
        BankAccount Myacc = new BankAccount();
        Myacc.Username = "Divyansh singh";
        Myacc.setpassword("fghfdb");
    }
}

class BankAccount {
    public String Username;
    private String password;

    public void setpassword(String pwd) {
        this.password = pwd;
    }
}

class pen {
    String Color;
    int Tip;

    void SetColor(String newColor) {
        Color = newColor;
    }

    void SetTip(int newTip) {
        Tip = newTip;

    }
}
