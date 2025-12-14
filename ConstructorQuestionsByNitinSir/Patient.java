/*
 30. Write a Java program to create a class called Patient with attributes name and
patientId. Create a constructor to initialize these attributes and display patient
details.
 */

 public class Patient {
 
    String name;
    int patientId;

    Patient(String n, int pId)
    {
        name=n;
        patientId=pId;
    }


    void pDetails()
    {
        System.out.println("Patient details is : ");
        System.out.println("Name : "+name);
        System.out.println("Patient Id : "+patientId);
    }

    public static void main(String[] args) {
        Patient p =new Patient("Sakshi", 45687);
        p.pDetails();
    }
    
 }