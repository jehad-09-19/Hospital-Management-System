package model;
public class Nurse extends User {
    private String shift;
    private String department;
    public Nurse() {
        super();
        setRole(User.NURSE);
    }
    public Nurse(String userId, String password, String name, String email, String contactNo, String shift, String department) {
        super(userId, password, name, email, contactNo, User.NURSE);
        this.shift = shift;
        this.department = department;
    }
    public String getShift() {
        return shift;
    }
    public void setShift(String shift) {
        this.shift = shift;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void displayNurseInfo() {
        System.out.println("User ID: " + getUserId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Contact No: " + getContactNo());
        System.out.println("Shift: " + shift);
        System.out.println("Department: " + department);
    }
}