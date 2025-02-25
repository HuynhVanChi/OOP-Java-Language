package HOMEWORK.chuong_3.Bai11;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(50.00);//create Account object
        Account account2 = new Account(-7.53);

        //display initial balance of each object
        System.out.printf("account1 balance: $%.2f\n",account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n\n",account2.getBalance());

        //Create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);
        double depositAmount; // deposit amount read from user
        System.out.print("Enter deposit amount for account1: ");
        depositAmount = input.nextDouble(); //obtain user input
        System.out.printf("\nadding %.2f to account1 balance\n\n",depositAmount);
        account1.credit(depositAmount);

        //display balance
        System.out.printf("account1 balance: $%.2f\n",account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n\n",account2.getBalance());

        System.out.print("Enter deposit amount for account2: "); //Prompt
        depositAmount = input.nextDouble();
        System.out.printf("\nadding %.2f to acount2 balance \n\n",depositAmount);
        account2.credit(depositAmount); //add to account2 balance

        //display balance
        System.out.printf("account1 balance: $%.2f\n",account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n\n",account2.getBalance());
    }
}
