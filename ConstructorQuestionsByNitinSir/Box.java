/*
 13. Write a Java program to create a class called Box with attributes length, width,
and height. Create a constructor to initialize these attributes and calculate the
volume.
 */
public class Box {
    
    float length;
    float width;
    float height;

    Box(){

        length = 14.1f;
        width = 5.5f;
        height= 23.1f;


    }

    void volume(){
        float v = length*width*height;
        System.out.println("Volume of the box is : "+v);
    }


    public static void main(String[] args) {
        
        Box b =new Box();
        b.volume();
    }
}
