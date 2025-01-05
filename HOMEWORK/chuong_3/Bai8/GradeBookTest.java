package HOMEWORK.chuong_3.Bai8;

import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        //Create Scanner to obtain input from commad window
        Scanner input = new Scanner(System.in);

        //Create a GradeBook object and assign it to myGradeBook
        GradeBook myGradeBook = new GradeBook();
        
        //prompt gor and input course name
        System.out.print("Please enter the course name:" );
        String nameOfCourse = input.nextLine();
        System.out.println(); // outputs a blank line

        //call myGradeBook's displayMessage method
        //and pass nameOfCourse as an argument
        myGradeBook.displayMessage(nameOfCourse);
    }
}
