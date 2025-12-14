/*
 20. Write a Java program to create a class called Library with attributes bookTitle
and bookId. Create a no-argument constructor with default values and print library
details.
 */
public class Library 
{
    
    String bookTitle;
    int bookId;
    
    
    Library()
    {

        bookTitle="Psychology of Money";
        bookId = 4251;
    }

    void printDetails()
    {
        System.out.println("Book Title is : "+bookTitle);
        System.out.println("Book ID is : "+bookId);
    }



    public static void main(String[] args) {
        Library lib = new Library();
        lib.printDetails();
    }
}
