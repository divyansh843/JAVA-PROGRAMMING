import java.util.*;
public class Btps

{
    String nm; int age; long contact; String course; int chose;
    
    
    public void course(){
        
        System.out.println("Job oriented Courses");
         System.out.println("1. Java Full Stcak Devloper");
         System.out.println("2. Mern Stcak Devloper");
         System.out.println("3. Machine Learning");
         System.out.println("4. Pyton Devloper");
        System.out.println("5.Advance Digital Marketing ");
        System.out.println("6. Dot Net Devloper");
        
        
       
    }
     public void courseinfo(int chose){
         if(chose==1){
             System.out.println("\nJava Full Stack Devloper Course");
             System.out.println("Duration: 6 Month");
             System.out.println("Start From: 5 November 10:30AM");
         }
        else if(chose==2){
             System.out.println("\nMern  Stack Devloper Course");
             System.out.println("Duration: 4 Month");
             System.out.println("Start From: 4 November 12:30AM");
         }
         else if(chose==3){
             System.out.println("\nMachine Learning Course");
             System.out.println("Duration: 12 Month");
             System.out.println("Start From: 7 November 1:30AM");
         }
         else if(chose==4){
             System.out.println("\nPyton Devloper Course");
             System.out.println("Duration: 6 Month");
             System.out.println("Start From: 4 November 2:00AM");
         }
         else if(chose==5){
             System.out.println("\nAdvance Digital  Marketing Course");
             System.out.println("Duration: 7 Month");
             System.out.println("Start From: 10 November 5:00AM");
         }
          else if(chose==6){
             System.out.println("\nDot Net Devloper Course");
             System.out.println("Duration: 6 Month");
             System.out.println("Start From: 11 November 6:00AM");
         }
         
     
     else{
          System.out.println(" Course Not found");
     }
     }
     public void Regi(String answer){
         		 System.out.println("Do want to Register this course yes/no..");

         if(answer.equalsIgnoreCase("yes")){
           
             System.out.println("\nWelcome To Registration Page");
             Scanner sc = new Scanner(System.in);
              System.out.println("Enter the name..");
              String nm = sc.nextLine();
              System.out.println("Enter the Age..");
              int age =sc.nextInt();
              System.out.println("Enter the Contact..");
              long contact =sc.nextLong();
              System.out.println("\nRegisrtration Sucessful");
               System.out.println("Enter the name "+nm);
               System.out.println("Enter the Age "+age);
               System.out.println("Enter the Contact "+ contact);
              
             
             
             
             
         }
         else{
               System.out.println("Regisrtration Cancel");
         }
     }
     
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	Btps s= new Btps();
		s.course();
		System.out.println("\nselect Course (1-6)...");
		int chose =sc.nextInt();
		s.courseinfo(chose);
		
		
		s.Regi("yes");
	
		
		
	
	}
}