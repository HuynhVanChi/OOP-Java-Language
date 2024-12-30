import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Account myAccount = new Account();

        System.out.println("Ten chua chua duoc cai dat la: " + myAccount.GetName());

        System.out.print("Xin moi nhap ten ban: ");
        String theName = input.nextLine();

        myAccount.SetName(theName);
        System.out.println();

        System.out.println("Ten sau khi duoc nhap vao la: " + myAccount.GetName());
    }
}
