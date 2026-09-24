package model;

public class Patient extends User {
    private int age;
    private String gender;
    private String bloodGroup;
    private String diseaseHistory;

    public Patient() {
        super();
        this.role = User.PATIENT; //[cite: 3]
    }

    public Patient(String userId, String password, String name, String email, 
                   String contactNo, int age, String gender, String bloodGroup, String diseaseHistory) {
        super(userId, password, name, email, contactNo, User.PATIENT); //[cite: 3]
        this.age = age;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.diseaseHistory = diseaseHistory;
    }

    // Getters and Setters
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getBloodGroup() { return bloodGroup; }
    public void setBloodGroup(String bloodGroup) { this.bloodGroup = bloodGroup; }

    public String getDiseaseHistory() { return diseaseHistory; }
    public void setDiseaseHistory(String diseaseHistory) { this.diseaseHistory = diseaseHistory; }
}