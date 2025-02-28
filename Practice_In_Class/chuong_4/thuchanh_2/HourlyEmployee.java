package Practice_In_Class.chuong_4.thuchanh_2;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    //Ham khoi tao co 5 thong so
    //3 thong so cua ham superclass Employee
    public HourlyEmployee(String firstName , String lastName , String socialSecurityNumber , double wage , double hours)
    {
        super(firstName, lastName, socialSecurityNumber);
        //check dau vao
        if(wage < 0.0)
        {
            throw new IllegalArgumentException("Hourly wage must ba >= 0.0");
        }

        if((hours < 0.0)||(hours > 168.0))
        {
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        }
        this.wage = wage;
        this.hours = hours;
    }

    //Thiet lap luong theo gio (wage)
    public void setWage(double wage)
    {
        //check dau vao
        if(wage < 0.0)
        {
            throw new IllegalArgumentException("Hours wage must be >= 0.0");
        }
        this.wage = wage;
    }

    public double getWage(){return wage;}
    //Thiet lap tong gio lam (Hours)
    public void setHours(double hours)
    {
        if((hours < 0.0)||(hours > 168.0))
        {
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        }
        this.hours =hours;
    }

    public double getHours(){return hours;}

    //Tinh toan luong 
    @Override
    public double earnings()
    {
        //Neu khong du
        //Neu du thi duoc tra luong lam them gio(tuc la gap 1,5 lan muc luong theo gio)
        //cho tat ca cac gio lam viec(hours) vuot qua 40 gio
        if(getHours() <= 40)
        {
            return getHours()*getWage();
        }
        else
        {
            return 40*getWage()+(getHours()-40)* getWage()*1.5;
        }
    }

    //toString
    @Override
    public String toString()
    {
        return String.format("hourly employee: %s%n%s: $%,.2f;%s:%,2f", super.toString() , "hourly wage",getWage(),"hours worked",getHours());
    }
}
