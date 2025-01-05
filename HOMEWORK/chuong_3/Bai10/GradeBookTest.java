package HOMEWORK.chuong_3.Bai10;

public class GradeBookTest {
    public static void main(String[] args) {
        
        //Create GradeBook object
        GradeBook gradeBook1 = new  GradeBook("CS101 introduction to Java Programmiog");
        GradeBook gradeBook2 = new GradeBook("CS102 Data Structures in Java");

        //display initial value of courseName for each GradeBook
        System.out.printf("gradeBook1 course name is: %s\n",gradeBook1.getCourseName());
        System.out.printf("gradeBook2 course name is: %s\n",gradeBook2.getCourseName());
    }
}
