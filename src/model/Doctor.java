package model;

public class Doctor extends User
{
    private String specialist;
    private String educationInformation;

    public Doctor()
    {
        super();
    }

    public Doctor(String userId, String password, String name,
                  String email, String contactNo, int role,
                  String specialist, String educationInformation)
    {
        super(userId, password, role);

        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
        this.specialist = specialist;
        this.educationInformation = educationInformation;
    }

    public void setSpecialist(String specialist)
    {
        this.specialist = specialist;
    }

    public String getSpecialist()
    {
        return this.specialist;
    }

    public void setEducationInformation(String educationInformation)
    {
        this.educationInformation = educationInformation;
    }

    public String getEducationInformation()
    {
        return this.educationInformation;
    }

    public String toStringDoctor()
    {
        String str = this.userId + "," +
                this.name + "," +
                this.email + "," +
                this.contactNo + "," +
                this.specialist + "," +
                this.educationInformation + "\n";

        return str;
    }

    public Doctor formDoctor(String str)
    {
        String information[] = str.split(",");

        if(information.length >= 6)
        {
            Doctor d = new Doctor();

            d.setUserId(information[0]);
            d.setName(information[1]);
            d.setEmail(information[2]);
            d.setContactNo(information[3]);
            d.setSpecialist(information[4]);
            d.setEducationInformation(information[5]);

            return d;
        }
        else
        {
            return null;
        }
    }
}
