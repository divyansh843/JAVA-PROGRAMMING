/*
 19. Write a Java program to create a class called Clock with attributes hours and
minutes. Create a constructor to initialize these attributes and display the time.

 */

public class Clock
 {
                int hours;
                int minutes;
                
                
                Clock()
                {
                    hours = 01;
                    minutes=15;

                }

                void displayTime()
                {
                    System.out.println("Time is :  "+hours+":"+minutes);
                }

                public static void main(String[] args) {
                    Clock cl = new Clock();
                    cl . displayTime();
                }


}
