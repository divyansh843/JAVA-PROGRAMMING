package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicsOfArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(6);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int ele = sc.nextInt();
            al.add(ele);    
        }

        System.out.print(al);
        
    }
    
}
