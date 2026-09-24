package model;

public class Patient {
    private String gender;
    private int age;
    private String address;

    public Patient() {

    }

    public Patient(String gender, int age, String address) {
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayPatientInfo() {
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
