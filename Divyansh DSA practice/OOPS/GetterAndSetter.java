public class GetterAndSetter {
    public static void main(String args[]) {
        pen p1 = new pen(); // created a pen object called p1

        p1.SetColor("blue");
        System.out.println(p1.GetColor());
        p1.SetTip(5);
        System.out.println(p1.GetTip());
        p1.SetColor("yellow");
        System.out.println(p1.GetColor());

    }

}

class pen {
    private String Color;
    private int Tip;

    String GetColor() {
        return this.Color;
    }

    int GetTip() {
        return this.Tip;
    }

    void SetColor(String newColor) {
        this.Color = newColor;
    }

    void SetTip(int newTip) {
        this.Tip = newTip;

    }
}
