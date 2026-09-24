package model;

public class Nurse {
    private  String shift;
    private  String department;
    public Nurse(){

    }
    public Nurse(String shift,String department){
        this.shift = shift;
        this.department = department;
    }
    public String getShift(){
        return shift;
    }
    public String getDepartment(){
        return department;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void displayNurseInfo(){
        System.out.println("Shift: " + shift);
        System.out.println("Department: " + department);
    }
}
