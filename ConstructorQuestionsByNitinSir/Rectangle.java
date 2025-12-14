/*
 3. Write a Java program to create a class called Rectangle with attributes length
and width. Create a constructor to initialize these attributes and calculate the
area.

 */
public class Rectangle
 {
    int lenght;
    int width;


    Rectangle()
    {
        lenght=45;
        width=14;
    }

    void area()
    {
        int a = lenght*width;
        System.out.println("Area of Rectangle is : "+a);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
    }
}
