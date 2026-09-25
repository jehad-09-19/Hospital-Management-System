package model;

public class Patient extends User
{
    private String age;
    private String gender;
    private String bloodGroup;
    private String diseaseHistory;

    public Patient()
    {
        super();
        this.role = User.PATIENT;
    }

    public Patient(String userId, String password, String name, String email, String contactNo, int role, String age, String gender, String bloodGroup, String diseaseHistory)
    {
        super(userId, password, role);
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
        this.age = age;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.diseaseHistory = diseaseHistory;
    }

    public void setAge(String age)
    {
        this.age = age;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public void setBloodGroup(String bloodGroup)
    {
        this.bloodGroup = bloodGroup;
    }

    public void setDiseaseHistory(String diseaseHistory)
    {
        this.diseaseHistory = diseaseHistory;
    }

    public String getAge()
    {
        return this.age;
    }

    public String getGender()
    {
        return this.gender;
    }

    public String getBloodGroup()
    {
        return this.bloodGroup;
    }

    public String getDiseaseHistory()
    {
        return this.diseaseHistory;
    }

    public String toStringPatient()
    {
        String str = this.userId + "," + this.name + "," + this.email + "," + this.contactNo + "," + this.age + "," + this.gender + "," + this.bloodGroup + "," + this.diseaseHistory + "\n";
        return str;
    }

    public Patient formPatient(String str)
    {
        String information[] = str.split(",");

        if (information.length >= 8)
        {
            Patient p = new Patient();
            p.setUserId(information[0]);
            p.setName(information[1]);
            p.setEmail(information[2]);
            p.setContactNo(information[3]);
            p.setAge(information[4]);
            p.setGender(information[5]);
            p.setBloodGroup(information[6]);
            p.setDiseaseHistory(information[7].trim());
            return p;
        }
        else
        {
            return null;
        }
    }
}
