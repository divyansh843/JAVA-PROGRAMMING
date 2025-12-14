/*
 9. Write a Java program to create a class called Triangle with attributes base and
height. Create a constructor to initialize these attributes and calculate the area.
 */
public class Triangle {
    float base;
    float height;


    Triangle(float b,float h){

        base=b;
        height=h;
    }
    float area(){

       float a = .5f * base*height;
       return a;

       
    }

    public static void main(String[] args) {
        Triangle t =new Triangle(24f, 42f);
        System.out.println("Area of Triangle is : "+t.area());
    }
}
