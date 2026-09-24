import model.Patient;

public class Main {

    public static void main(String[] args) {
        patientApp();
    }

    public static void patientApp() {
        System.out.println("\n--- Patient Details ---");
        Patient patient = new Patient("Female", 24, "123 Main Street, Dhaka");
        patient.displayPatientInfo();
    }
}
