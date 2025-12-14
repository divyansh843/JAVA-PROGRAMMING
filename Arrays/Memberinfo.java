import java.util.Scanner;

public class Memberinfo {

    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.println("Itne members ka data store karna hai : ");
        int n = s.nextInt();
        String MemName[] = new String[n];
        int MemAge[] = new int[n];
        String Relation[] = new String[n];



        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i+1) + " member detail");

            System.out.print("Enter member Name : ");
            MemName[i] = s.next();

            System.out.print("Enter member Age : ");
            MemAge[i] = s.nextInt();

            System.out.print("Enter member relation : ");
            Relation[i] = s.next();
            
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Member name is " + MemName[i] + " age " + 
            MemAge[i] + " relation " + Relation[i] );
            
        }
   
    }
    
}
