import java.util.*;
class Voting {
String nm ; int age;
int choice;
public void vote(String nm,int age , int choice){
        

        if (age >= 18) {
            System.out.println("You are eligible to vote");
 if(choice==1){
System.out.println("You voted Bjp");

}
else if(choice==2){
System.out.println("You voted Congress");

        } 
else{
 System.out.println("Invalid choice");
}
}else {
            System.out.println("Sorry, you are not eligible to vote");
        }}


    public static void main(String[] args) {
Voting a= new Voting();
a.vote("Khushi" ,20 ,1);
       
    }
}
