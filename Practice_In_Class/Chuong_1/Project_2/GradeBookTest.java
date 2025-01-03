package Practice_In_Class.Chuong_1.Project_2;

public class GradeBookTest {
    public static void main(String[] args) {
        //Khoi tao diem so cho sinh vien
        int[] gradesArray = {87,68,94,100,83,78,85,91,76,87};
        
        //Tao object ten myGradeBook
        GradeBook myGradeBook = new GradeBook("Lap trinh huong doi tuong" , gradesArray);
        
        System.out.printf("Bang diem cho mon hoc%n%s%n%n",myGradeBook.GetCourseName());
        myGradeBook.processGrades();
    }
}
