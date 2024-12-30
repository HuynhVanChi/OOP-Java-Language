package Practice_In_Class.Buoi1.Thuchanh3;

public class Account {
    private String name;
    private double balance;

    public Account(String name , double balance)
    {
        this.name = name;

        if(balance > 0.0)
        {
            this.balance = balance;
        }
    }

    public void SetName(String name)
    {
        this.name = name;
    }

    public String GetName()
    {
        return name;
    }

    public void deposit(double depositAmount)
    {
        if(depositAmount > 0.0)
        {
            balance += depositAmount;
        }
    }

    public double GetBalance()
    {
        return balance;
    }
}
