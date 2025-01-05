package HOMEWORK.chuong_3.Bai1;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        
        //write your code here
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name1: ");
        String name1 = sc.nextLine();
        System.out.println("Name 1 entered is ' " + name1 + " '.");
        
        //Cach 1 dong
        System.out.println();
        
        System.out.print("Enter name2: ");
        String name2 = sc.next();
        System.out.println("Name 2 enrered is ' " + name2 + " '.");
    }
}
