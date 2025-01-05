package HOMEWORK.chuong_3.Bai9;

public class GradeBook {
    private String courseName; //course name for this GradeBook

    //method to set the course name
    public void setCourseName(String name)
    {
        courseName = name;
    }

    //method to retrieve the cours name
    public String getCourseName()
    {
        return courseName;
    }
    
    //display a welcome message to the GradeBook user
    public void displayMessage()
    {
        //calls getCourseName to get the name of
        //the course this GradeBook represents
        System.out.printf("Welcome to the grade book for\n%s!\n", getCourseName());
    }
}
