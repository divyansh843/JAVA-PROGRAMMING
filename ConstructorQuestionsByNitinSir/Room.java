/*
 17. Write a Java program to create a class called Room with attributes length and
width. Create a constructor to initialize these attributes and calculate the area.

 */

public class Room 
{
        int length;
        int width;


        Room
        ()
        {
                length = 45;
                width= 12;

        }

        void area()
        {
            int a = length*width;
            System.out.println("Area is : "+ a);
        }

        public static void main(String[] args) {
            Room r =new Room();
            r.area();

        }
}
