import java.util.*;
public class Hospital
{
	String nm;                                                                                                                                                                                                                                                                                                                                                                
 int  totalslot=10;
   int bookedslot=0;
  	
	int age;
	public void slot(String nm, int age) {
	if(bookedslot<+totalslot){
			if (age<=22) {
				System.out.println(nm+" "+"Your Appoinment is booked Morning 10:30");
			}
			else {
				System.out.println(nm+" "+"Your Appoinment is booked Evening 5:30");
			}
			bookedslot++;
	}
	else {
	    System.out.println("Sorry Slot is not Avilable");
	}
	}
	public static void main(String[] args) {
		Hospital s=new Hospital();

		s.slot("Ram",30);
		s.slot("seeta",20);
		
		
	}
}