import java.util.*;
public class arraycc { 
    // public static void update( int marks[]){
    //     for(int i)
    // }
    // public static void main(String args[]){
    //     int marks = { 97 , 98 , 99 }; 

     // revrse an array
      public static void reverse(int numbers[]){
        int first = 0 , last = numbers.length-1;
         
        while(first < last){
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
      }

    public static void main(String args[]){
        int  numbers[] = { 1 , 3 , 4 , 5 };

        reverse(numbers);

        for( int i=0; i<=numbers.length-1; i++){
            System.out.print(numbers[i] + "  ");
        }
          System.out.println();


       }
    }
    

