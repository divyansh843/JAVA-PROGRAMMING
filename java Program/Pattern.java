import java.util.*;
class Pattern{
public static void main(String [] arr)
{
int i=1;
while(i<=5){
int j=1;
while(j<=i){
System.out.print("*");
j++;
}
System.out.println();
i++;
}

}
}
class Revpt{
public static void main(String [] arr){
int i=1;
while(i<=5){
int j=5;
while(j>=i){
System.out.print("*");
j--;
}
System.out.println();
i++;
}
}

}