import model.Nurse;

public class Main {
    public static void main(String[] args) {
        Nurse nurse = new Nurse("N-01", "pass123", "Fatema Begum", "fatema@gmail.com", "01712345678", "Morning", "Cardiology");
        System.out.println("Nurse Details");
        nurse.displayNurseInfo();
    }
}