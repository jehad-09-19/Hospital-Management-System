import view.PatientView;
import controller.PatientController;

public class Main {
    public static void main(String[] args) {
        initializeApp();
    }

    private static void initializeApp() {
        PatientView patientView = new PatientView();
        PatientController patientController = new PatientController(patientView);
        patientController.start();
    }
}
