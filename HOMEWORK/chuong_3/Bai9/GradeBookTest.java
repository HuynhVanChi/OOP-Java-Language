package HOMEWORK.chuong_3.Bai9;

import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        //Create Scanner to obtain unput from command window
        Scanner input = new Scanner(System.in);

        //Create a GradeBook object and assign it to myGradeBook
        GradeBook myGradeBook = new GradeBook();

        //display initial value of crouseName
        System.out.printf("Initial course name is: %s\n\n",myGradeBook.getCourseName());

        //pronpt for and read course name
        System.out.print("please enter the course name: ");
        String theName = input.nextLine();//read a line of text
        myGradeBook.setCourseName(theName); // set the course name
        System.out.println(); //outputs a blank line

        //display welcome message after specifying course name
        myGradeBook.displayMessage();
    }
}
