/*
 16. Write a Java program to create a class called Product with attributes name, price,
and quantity. Create a constructor to initialize these attributes and calculate total
cost.
 */
public class Product {
    String name ;
    int price;
    int quantity;

     Product()
     {

        name ="Register";
        price = 50;
        quantity = 5;

     }

     void cost()
     {

        int cost = price*quantity;
        System.out.println("Total Cost is : "+cost);
     }


     public static void main(String[] args) {
        Product p =new Product();
        p.cost();
     }

}
