package Practice_In_Class.chuong_4.thuchanh_2;

public abstract class Employee {
    
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    //khoi tao Contructer
    public Employee(String firstName , String lastName , String socialSecurityNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //doc cac gia tri
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getSocialSecurityNumber(){return socialSecurityNumber;}

    //toString()
    @Override
    public String toString()
    {
        return String.format("%s%s%nSocial Security Number: %s", getFirstName(),getLastName(),getSocialSecurityNumber());
    }

    //Khai bao danh da hinh, o day chung ta khong can viet ham, cac subclass se viet nhung can khai bao la
    //chung co chung 1 ham
    public abstract double earnings();
}
