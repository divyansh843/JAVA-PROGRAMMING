/*

25. Write a Java program to create a class called Cube with an attribute side. Create
a constructor to initialize the side and calculate the volume.

 */

public class Cube {
    int side;


    
    Cube(int s)
    {
        side = s;

    }

    void volume()
    {
        int v = side *side*side;
        System.out.println("Volume of the cube is : "+v);

    }


    public static void main(String[] args) {
        Cube c = new Cube(4);

        c.volume();
    }
}
