import java.util.*;
public class Weather

{
    String city; int chose;
    
    public void checkweather(String city){
        
        
        if(city.equalsIgnoreCase("Kanpur")){
           
            System.out.println(city+" weather is Sunny");
        }
       else if(city.equalsIgnoreCase("Lucknow")){
           
            System.out.println(city +" Weather is Cold");
        }
       else if(city.equalsIgnoreCase("Delhi")){
           
            System.out.println(city+" Weather is Rainy");
        }
       else if(city.equalsIgnoreCase("Agra")){
           
            System.out.println(city+" Waether is clear sky");
        }
       else if(city.equalsIgnoreCase("Manali")){
           
            System.out.println(city+" Weather is Snowy");
        }
    else{
System.out.println(city+" weather info not found");
    }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your City:");
		String city = sc.nextLine();
		Weather s=new Weather();
		s.checkweather(city);
	
		
		
	
	}
}