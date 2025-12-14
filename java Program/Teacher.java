import java.util.*;
public class Teacher{
String nm;
String subject;
Teacher(String nm,String subject){
this.nm=nm;
this.subject=subject;

}
public void period(String time){
if(time.equalsIgnoreCase("10pm")){
System.out.println("Math class is start");
}
else if(time.equalsIgnoreCase("12pm")){
System.out.println("English class is start");
}
else if(time.equalsIgnoreCase("1pm")){
System.out.println("Science class is start");}
else{
System.out.println("no class");
}

}



public static void main(String[] arr){
Teacher t = new Teacher("khushi","Math");
t.period("1pm");


}
}