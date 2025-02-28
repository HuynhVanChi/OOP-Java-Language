package Practice_In_Class.chuong_4.thuchanh_2;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    //Khoi tao co 4 thong so nhu de bai va bang o tren
    public SalariedEmployee(String firstName , String lastName , String socialSecurityNumber , double weeklySalary)
    {
        //3 thong so dau co trong Employee nen ta chi can super khoi tao
        super(firstName, lastName, socialSecurityNumber);

        //kiem tra gia tri nhap vao
        if(weeklySalary < 0.0)
        {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }

        this.weeklySalary = weeklySalary;
    }

    //set salary
    public void setWeeklySalary(double weeklySalary)
    {
        //Kiem tra gia tri nhap vao
        if(weeklySalary < 0.0)
        {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    //get salary
    public double getWeeklySalary(){return weeklySalary;}

    //Bay gio chung ta tinh toan thu nhap earning
    //earing da duoc khai bao trong supberclass(Employee): Da Hinh
    @Override
    public double earnings(){return getWeeklySalary();}

    //toString 
    @Override
    public String toString()
    {
        return String.format("salaried employee: %s%n%s:$%,.2f", super.toString(),"weekly salary",getWeeklySalary());
    }
}
