/*\
 21. Write a Java program to create a class called Square with an attribute side. Create
a constructor to initialize the side and calculate the area.

 */

public class Square {
    
int side;

Square(int s)
{
    side = s;
}

void area()
{
    int a = side*side;
    System.out.println("Area of Square is : "+a+" m^2 . ");
}

public static void main(String[] args) {
    Square sq = new Square(20);

    sq.area();

}

}
