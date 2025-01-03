package Practice_In_Class.Chuong_1.Thuchanh3;

import java.util.Scanner;

public class AccountTest3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Account account1 = new Account(null,50.0);
        Account account2 = new Account(null, -7.730);

        //Cho nguoi dung nhap ten
        System.out.print("Xin moi nguoi dung nhap Ho va ten cua Account 1: ");
        String theName = input.nextLine();
        account1.SetName(theName);
        System.out.print("Xin moi nguoi dung nhap Ho va ten cua Account 2: ");
        theName = input.nextLine();
        account2.SetName(theName);

        //Check so tai khoan ban dau
        System.out.println(account1.GetName() + " co so du la: " + account1.GetBalance());
        System.out.println(account2.GetName() + " co so du la: " + account2.GetBalance());
        System.out.println();

        //Cho phep nguoi dung nhap deposit
        System.out.print("Nhap so can nap cho Account 1: ");
        double depositAmount = input.nextDouble();
        
        //hien thi lai noi dung can nap de kiem tra dung chua
        System.out.println("Ban dang cong them Account 1: " + depositAmount);
        account1.deposit(depositAmount);
        
        //check so tai khoan sau khi nap
        System.out.println(account1.GetName() + " co so du la: " + account1.GetBalance());
        System.out.println(account2.GetName() + " co so du la: " + account2.GetBalance());
        System.out.println();

        //Account 2
        //Cho phep nguoi dung nhap deposit
        System.out.print("Nhap so can nap cho Account 2: ");
        depositAmount = input.nextDouble();
        
        //hien thi lai noi dung can nap de kiem tra dung chua
        System.out.println("Ban dang cong them Account 2: " + depositAmount);
        account2.deposit(depositAmount);
        
        //check so tai khoan sau khi nap
        System.out.println(account1.GetName() + " co so du la: " + account1.GetBalance());
        System.out.println(account2.GetName() + " co so du la: " + account2.GetBalance());
    }
}
