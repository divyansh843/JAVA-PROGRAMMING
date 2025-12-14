/*
2. Write a Java program to create a class called Book with attributes title and
author. Create a no-argument constructor that sets default values and prints the
book details.

 */
public class Book 
{
    String title;
    String author;

    Book(){
        title="Saara Akash";
        author="Rajendra Yadav";

    }

    void showBookDetails(){

        System.out.println("The Title of book is : "+title);
        System.out.println("The Author of "+title+" is : "+author);
    }

    public static void main(String[] args) {
        Book b =new Book();
        b.showBookDetails();
    }

}
