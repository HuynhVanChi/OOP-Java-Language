package Practice_In_Class.Thuchanh2;

public class AccountTest2 {
    public static void main(String[] args) {
        Account account1 = new Account("Nguyen Van A");
        Account account2 = new Account("Tran Van B");

        System.out.println("Account 1 ten la: " + account1.GetName());
        System.out.println("Account 2 ten la: " + account2.GetName());
    }
}
