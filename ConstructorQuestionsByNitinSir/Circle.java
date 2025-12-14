/*
 5. Write a Java program to create a class called Circle with a radius attribute.
Create a constructor to initialize radius and calculate the circumference.
 */
public class Circle
 {
        double radius ;
        static double pi=3.14;


        Circle(){
            radius=45;
        }

        void circumference(){

            double circum = 2*pi*radius;
            System.out.println("Circumference of Circle is : "+circum);
        }

        public static void main(String[] args) {
            Circle cir = new Circle();
            cir.circumference();
        }
}
