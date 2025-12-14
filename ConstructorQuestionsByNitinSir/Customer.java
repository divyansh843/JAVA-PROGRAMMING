/*
 18. Write a Java program to create a class called Customer with attributes name and
customerId. Create a constructor to initialize these attributes and print customer
details.

 */

public class Customer {
    String name ;
    int customerId;



    Customer(String nm,int cId)
{
            name=nm;
            customerId=cId;
}

    void customerDetails()
    {

        System.out.println("Customer name is: "+name);
        System.out.println("Customer ID : "+customerId);
    }

    public static void main(String[] args) {
        Customer c =new Customer("Mahak", 22);

        c.customerDetails();
    }

}
