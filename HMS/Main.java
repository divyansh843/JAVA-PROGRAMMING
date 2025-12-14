package HMS;
import java.util.*;

// Class to store Patient details
class Patient {
    int id;
    String name;
    int age;
    String gender;
    String problem;

    public Patient(int id, String name, int age, String gender, String problem) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.problem = problem;
    }

    @Override
    public String toString() {
        return "--------------------------------------" +
               "\nPatient ID   : " + id +
               "\nName         : " + name +
               "\nAge          : " + age +
               "\nGender       : " + gender +
               "\nProblem      : " + problem +
               "\n--------------------------------------";
    }
}

// Class to store Appointment details
class Appointment {
    int appointmentId;
    Patient patient;
    String doctorName;
    String date;

    public Appointment(int appointmentId, Patient patient, String doctorName, String date) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctorName = doctorName;
        this.date = date;
    }

    @Override
    public String toString() {
        return "--------------------------------------" +
               "\nAppointment ID: " + appointmentId +
               "\nPatient Name  : " + patient.name +
               "\nDoctor        : " + doctorName +
               "\nDate          : " + date +
               "\n--------------------------------------";
    }
}

// Main class
public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<Patient> patients = new ArrayList<>();
    static List<Appointment> appointments = new ArrayList<>();
    static int patientIdCounter = 1;
    static int appointmentIdCounter = 1;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== HOSPITAL MANAGEMENT SYSTEM ===");
            System.out.println("1. Register New Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Assign Appointment");
            System.out.println("4. View All Appointments");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1 -> registerPatient();
                case 2 -> viewPatients();
                case 3 -> assignAppointment();
                case 4 -> viewAppointments();
                case 5 -> {
                    System.out.println("\nThank you for using Hospital Management System. Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice! Please select between 1–5.");
            }
        }
    }

    // Register new patient
    static void registerPatient() {
        System.out.println("\n--- Register New Patient ---");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter Problem: ");
        String problem = sc.nextLine();

        Patient p = new Patient(patientIdCounter++, name, age, gender, problem);
        patients.add(p);
        System.out.println("\n✅ Patient Registered Successfully!");
    }

    // View all patients
    static void viewPatients() {
        System.out.println("\n--- Patient List ---");
        if (patients.isEmpty()) {
            System.out.println("No patients registered yet!");
            return;
        }
        for (Patient p : patients) {
            System.out.println(p);
        }
    }

    // Assign appointment to existing patient
    static void assignAppointment() {
        System.out.println("\n--- Assign Appointment ---");
        if (patients.isEmpty()) {
            System.out.println("No patients available. Please register a patient first!");
            return;
        }

        System.out.print("Enter Patient ID: ");
        int id = Integer.parseInt(sc.nextLine());

        Patient selected = null;
        for (Patient p : patients) {
            if (p.id == id) {
                selected = p;
                break;
            }
        }

        if (selected == null) {
            System.out.println("❌ Patient not found!");
            return;
        }

        System.out.print("Enter Doctor Name: ");
        String doctor = sc.nextLine();
        System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
        String date = sc.nextLine();

        Appointment a = new Appointment(appointmentIdCounter++, selected, doctor, date);
        appointments.add(a);
        System.out.println("\n✅ Appointment Assigned Successfully!");
    }

    // View all appointments
    static void viewAppointments() {
        System.out.println("\n--- Appointment List ---");
        if (appointments.isEmpty()) {
            System.out.println("No appointments assigned yet!");
            return;
        }
        for (Appointment a : appointments) {
            System.out.println(a);
        }
    }
}
