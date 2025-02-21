package Practice_In_Class.chuong_3.project_1;

public class CommissionEmployee{
    protected final String firstName;
    protected final String lastName;
    protected final String SecurityNumber;
    protected double grossSales;
    protected double commissionRate;

    public CommissionEmployee(String firstName , String lastName , String SecurityNumber, double grossSales , double commissionRate)
    {
        //check doanh số theo tuần
        if(grossSales < 0.0)
        {
            throw new IllegalArgumentException("Ty le hoa hong > 0.0 va  < 1.0");
        }
        
        //check Ty le hoa hong CommissionRate
        if(commissionRate <= 0.0 || commissionRate >= 1.0)
        {
            throw new IllegalArgumentException("Ty le hoa hong > 0.0 va < 1.0");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.SecurityNumber = SecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getSecurityNumber()
    {
        return SecurityNumber;
    }

    public void setGrossSales(double grossSales)
    {
        if(grossSales < 0.0)
        {
            throw new IllegalArgumentException("Doanh so phai >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getGrossSales()
    {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate)
    {
        if(commissionRate <= 0.0 || commissionRate >= 1.0)
        {
            throw new IllegalArgumentException("Ty le hoa hong > 0.0 va < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate()
    {
        return commissionRate;
    }

    public double earnings()
    {
        return commissionRate * grossSales;
    }

    //chi ra rang phuong phap nay ghi de len mot phuong phap sieu lop
    @Override //indicates that this method overrides a superclass method
    public String toString()
    {
        return String.format("%s: %s %s %n %s: %s %n %s: %2f%n%s: %2f", "commission employee " , firstName,lastName," social security number ", SecurityNumber," gross sales ", grossSales,"commission rate ", commissionRate);

    }
}