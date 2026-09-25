import model.User;
import model.Patient;

public class Main {

    public static void main(String[] args) {
        patientFunc();
    }

    private static void patientFunc() {
        System.out.println("=== PATIENT Info ===");

        Patient patient = new Patient("P201", "patientPass123", "Jerin", "jerin@hospital.com", "01800000000", User.PATIENT, "24", "Female", "B+", "None");
        
        System.out.println("User ID    : " + patient.getUserId());
        System.out.println("Name       : " + patient.getName());
        System.out.println("Age        : " + patient.getAge());
        System.out.println("Gender     : " + patient.getGender());
        System.out.println("Blood Group: " + patient.getBloodGroup());
        System.out.println("History    : " + patient.getDiseaseHistory());
    }
}
