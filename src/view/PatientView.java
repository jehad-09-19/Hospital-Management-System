package view;

import model.Patient;
import java.util.Scanner;

public class PatientView {
    private Scanner scanner = new Scanner(System.in);

    public int showPatientMenu() {
        System.out.println("\n=== PATIENT MANAGEMENT MENU ===");
        System.out.println("1. Register New Patient");
        System.out.println("2. View Patient Profile");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    public Patient getPatientInput() {
        scanner.nextLine();
        System.out.print("Enter Patient ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Password: ");
        String pass = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Contact No: ");
        String contact = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter Blood Group: ");
        String bloodGroup = scanner.nextLine();
        System.out.print("Enter Disease History: ");
        String diseaseHistory = scanner.nextLine();

        return new Patient(id, pass, name, email, contact, age, gender, bloodGroup, diseaseHistory);
    }

    public void displayPatientDetails(Patient patient) {
        if (patient == null) {
            System.out.println("No patient record found!");
            return;
        }
        System.out.println("\n--- Patient Profile ---");
        System.out.println("ID: " + patient.getUserId());
        System.out.println("Name: " + patient.getName());
        System.out.println("Email: " + patient.getEmail());
        System.out.println("Contact: " + patient.getContactNo());
        System.out.println("Age: " + patient.getAge() + " | Gender: " + patient.getGender());
        System.out.println("Blood Group: " + patient.getBloodGroup());
        System.out.println("Medical History: " + patient.getDiseaseHistory());
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}