package Practice_In_Class.chuong_4.thuchanh_2;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName,String lastName,String socialSecurityNumber, double grossSales, double commissionRate , double baseSalary)
    {
        //5 Thong so dau duoc thiet lap trong lop CommissionEmployee
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        
        //Thong so luong cung
        //kiem tra so duong
        if(baseSalary < 0.0)
        {
            throw new IllegalArgumentException("Luong cung phai >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary)
    {
        if(baseSalary < 0.0)
        {
            throw new IllegalArgumentException("Luong cung phai >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary()
    {
        return baseSalary;
    }

    //tinh lai thu nhap: dung @Override
    @Override
    public double earnings()
    {
        return getBaseSalary() + super.earnings();
    }

    //chen them luong cung vao toString() dung @Override
    @Override
    public String toString()
    {
        return String.format("%s%s;%s:$%,.2f","base-saleried ",super.toString(),"base salary", getBaseSalary());
    }

}
