import model.Nurse;
public class Main {
    public static void main(String[] args){
        Nurse myNurse = new Nurse("Night","Emergency");
        System.out.println(" Nurse Information");
        myNurse.displayNurseInfo();
        myNurse.setShift("Morning");
        myNurse.setDepartment("ICU");
        System.out.println(" \n Update Nurse Information");
        myNurse.displayNurseInfo();
    }
}