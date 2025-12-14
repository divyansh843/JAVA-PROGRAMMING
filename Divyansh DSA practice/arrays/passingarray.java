import java.util.*;

public class passingarray {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
            System.out.print(marks[i] + "  ");
        }
    }

    public static void main(String args[]) {
        int marks[] = { 97, 98, 99 };
        update(marks);
    }

}
