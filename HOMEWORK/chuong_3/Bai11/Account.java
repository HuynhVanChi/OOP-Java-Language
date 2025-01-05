package HOMEWORK.chuong_3.Bai11;

public class Account {
    private double balance;

    //constructor
    public Account(double initialBalance)
    {
        //validate that initialBalance is greater than 0.0
        //if it is not , balance is initialized to the default value 0.0
        if(initialBalance > 0.0) 
        {
            balance = initialBalance;    
        }
    }

    //Credit (add) an amount to the account
    public void credit(double amount)
    {
        balance += amount; //add amount to balace
    }

    //return the account balance
    public double getBalance()
    {
        return balance; // gives the value of balance to the calling method
    }
}
