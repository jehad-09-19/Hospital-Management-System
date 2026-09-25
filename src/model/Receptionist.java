package model;

public class Receptionist extends User
{
    private String deskNo;
    private String shift;

    public Receptionist()
    {
        super();
    }

    public Receptionist(String userId, String password, String name, String email,
                        String contactNo, int role, String deskNo, String shift)
    {
        super(userId, password, role);
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
        this.deskNo = deskNo;
        this.shift = shift;
    }

    public void setDeskNo(String deskNo)
    {
        this.deskNo = deskNo;
    }

    public String getDeskNo()
    {
        return this.deskNo;
    }

    public void setShift(String shift)
    {
        this.shift = shift;
    }

    public String getShift()
    {
        return this.shift;
    }

    public String toStringReceptionist()
    {
        String str = this.userId + "," + this.name + "," + this.email + ","
                + this.contactNo + "," + this.deskNo + "," + this.shift + "\n";

        return str;
    }

    public Receptionist formReceptionist(String str)
    {
        String information[] = str.split(",");

        if(information.length >= 6)
        {
            Receptionist r = new Receptionist();

            r.setUserId(information[0]);
            r.setName(information[1]);
            r.setEmail(information[2]);
            r.setContactNo(information[3]);
            r.setDeskNo(information[4]);
            r.setShift(information[5]);

            return r;
        }
        else
        {
            return null;
        }
    }
}
