package HOMEWORK.chuong_3.Bai10;

public class GradeBook {
    
    private String courseName; // course name for this GradeBook

    //constructor initializes courseName with String argument
    public GradeBook(String name)
    {
        courseName = name;
    }

    public void setCourseName(String name)
    {
        courseName = name;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void displayMessage()
    {
        System.out.printf("Welcome to the grade book for \n%s!\n",getCourseName());
    }
}
