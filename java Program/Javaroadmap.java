import java.util.*;
public class Javaroadmap

{
    String nm; int chose;
    Javaroadmap(String n){
        nm=n;
        System.out.println("Welcome to java Roadmap");
        System.out.println("1. Variables");
        System.out.println("2. Data Types");
        System.out.println("3. Fucntion");
        System.out.println("4. Opps concept");
        System.out.println("5. Construtor");
    }
    public void topic(int chose){
        System.out.println("Which Topic you want learn");
        if(chose==1){
            System.out.println("1. Variable");
            System.out.println("Variable a Nnamed box to store Data");
        }
        else if(chose==2){
            System.out.println("1. Data Type");
            System.out.println("Data type tells us which type of value wwe can store in variable");
        }
       else  if(chose==3){
            System.out.println("3.Function");
            System.out.println("Crete once call many times");
        }
       else  if(chose==4){
            System.out.println("4. Opps Concept");
            System.out.println("Making real world object in code to orgnize and reuse it easily");}
        else if(chose==5){
            System.out.println("5.Construtor");
            System.out.println("Speical method that create object and sets its intial value");
        
        
        
    }
    else{
System.out.println("This topic not found");
    }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Name:");
		String nm = sc.nextLine();
		Javaroadmap s=new Javaroadmap(nm);
			System.out.println("Enter Topic Number You want to learn(1-5)...");
			int chose = sc.nextInt();
		
		
		s.topic(chose);
	}
}