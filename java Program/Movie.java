import java.util.*;
 class Movie
{
	String nm;                                                                                                                                                                                                                                                                                                                                                                
 int  totalticket=10;
   int bookedticket=0;
  	
	int age;
	public void movieticket(String moviename ,  String nm , int numtickets , int seatpre) {
	if (moviename.equals("Jolly llb")){
	if(bookedticket+numtickets<=totalticket){
			System.out.println("Tickets Booked for "+nm);
				System.out.println("Movie name "+ moviename);
			
			System.out.println("Seat Number "+seatpre);
				System.out.println("Number of Tickets "+numtickets);
					System.out.println("Timing : Sat 5 November | Morning 10:30");
			bookedticket=bookedticket+numtickets;
	}
	    else {
	    System.out.println("Sorry Ticket is not Avilable");
	}
	}
	else if(moviename.equals("Housefull")){
	 	if(bookedticket+numtickets<=totalticket){
			System.out.println("Tickets Booked for "+nm);
				System.out.println("Movie name "+ moviename);
			
			System.out.println("Seat Number "+seatpre);
				System.out.println("Number of Tickets "+numtickets);
					System.out.println("Timing : Sat 5 November | Evening  5:30");
			bookedticket=bookedticket+numtickets;   
	}else {
	    System.out.println("Sorry Ticket is not Avilable");
	}
	}
	
	
	}
	public static void main(String[] args) {
		Movie s=new Movie();
		s.movieticket("Jolly llb","Khushi",1,20);
			s.movieticket("Housefull","Khushi",2,21);
				s.movieticket("Jolly llb","Ram",10,20);
					
	




		
	}
}