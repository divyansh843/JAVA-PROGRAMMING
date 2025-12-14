import java.util.*;

public class arrays {
    public static void main(String args[]) {
        int marks[] = new int[7];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt(); // maths
        marks[1] = sc.nextInt(); // phy
        marks[2] = sc.nextInt(); // chem
        System.out.println("maths marks is : " + marks[0]);
        System.out.println("phy marks is : " + marks[1]);
        System.out.println("chem marks is : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage = " + percentage + "%");
        System.out.println("length of array = " + marks.length);
    }

}
