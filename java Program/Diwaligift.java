import java.util.*;
public class Diwaligift

{
    String nm; 
    String position;
    Diwaligift(String n, String p ){
        this.nm=n;
        this.position=p;
        
    }
    public void gift(String p){
        if(p.equalsIgnoreCase("Manager")){
            System.out.println("Laptop");
        }
         else if(p.equalsIgnoreCase("HR")){
            System.out.println("Phone");
        }
          else if(p.equalsIgnoreCase("Senior Engineer")){
            System.out.println("Sweets");
        }
        else if(p.equalsIgnoreCase("junior Engineer")){
            System.out.println("choclate");
        }
        else{
             System.out.println("Sorry not avilable");
        }
        
   
}
public void show(){
            System.out.println(position+" "+ nm +" Congratulation you got diwali gift ");
        }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	Diwaligift s = new Diwaligift("Ram","hr");

	s.show();
	s.gift("hr");
	
		
		
		
		
	
	}
}