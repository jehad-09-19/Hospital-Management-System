package controller;

import model.Patient;
import view.PatientView;

public class PatientController {
    private Patient currentPatient;
    private PatientView view;

    public PatientController(PatientView view) {
        this.view = view;
    }

    public void start() {
        boolean running = true;
        while (running) {
            int choice = view.showPatientMenu();
            switch (choice) {
                case 1:
                    registerPatient();
                    break;
                case 2:
                    view.displayPatientDetails(currentPatient);
                    break;
                case 3:
                    running = false;
                    view.showMessage("Exiting Patient Module...");
                    break;
                default:
                    view.showMessage("Invalid choice. Try again.");
            }
        }
    }

    private void registerPatient() {
        this.currentPatient = view.getPatientInput();
        view.showMessage("Patient registered successfully!");
    }
}