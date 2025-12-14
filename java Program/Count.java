import java.util.*;

class Count{
    public static void main(String[] args) {
        String nm;
        int co = 0;

        System.out.println("Enter your name: ");
        Scanner s = new Scanner(System.in);
        nm = s.nextLine();

        for (int i = nm.length() - 1; i >= 0; i--) {
            char k = nm.charAt(i);
            if (k == 'a') {
                co++;
            }
        }

        System.out.println("Total no of a is " + co);
    }
}
