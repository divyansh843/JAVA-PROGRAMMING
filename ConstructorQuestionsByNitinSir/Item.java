/*
 28. Write a Java program to create a class called Item with attributes name and price.
Create a constructor to initialize these attributes and print item details.
 */

public class Item {
    
String name;
int price;


Item(String name , int p)
{
    this.name =name;
    price=p;

}

void details()
{

    System.out.println("Item details are : ");
    System.out.println("Name : " +name);
    System.out.println("Price : "+price+" Rs.");
}

public static void main(String[] args) {
    Item i =new Item("Watch", 1599);

    i.details();
}

}
