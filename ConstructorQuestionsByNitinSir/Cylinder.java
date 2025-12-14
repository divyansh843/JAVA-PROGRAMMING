/*
29. Write a Java program to create a class called Cylinder with attributes radius
and height. Create a constructor to initialize these attributes and calculate the
volume.
*/
public class Cylinder {
    
     int radius;
     int height;


     Cylinder(int r, int h)
     {
        radius=r;
        height=h;
     }


     void volume()
     {

        float v = 3.14f * radius*radius*height;
        System.out.println("Volume of the cylinder is : "+v+" m^3 .");
     }

     public static void main(String[] args) {
        Cylinder c = new Cylinder(2, 4);
        c.volume();
     }
}
