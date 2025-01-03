package Practice_In_Class.Chuong_1.Project_2;

public class GradeBook {
    
    private String courseName;
    private int[] grades;

    //Khoi tao
    public GradeBook(String courseName , int[] grades)
    {
        this.courseName = courseName;
        this.grades = grades;
    }

    public void SetCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public String GetCourseName()
    {
        return courseName;
    }

    //Xu ly du lieu nhap vao
    public void processGrades()
    {
        outputGrades();
        System.out.printf("%nClass average is %.2f%n",GetAverage());

        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",GetMinimum(),GetMaximum());

        //Bieu dien duoi dang chart
        outputBarChart();
    }
    
    //tim gia tri nho nhat
    //Phuong phap: lay gia tri dau tien khoi tao nho nhat sau do so sanh tu dau den cuoi
    //phan tu nao be hon thi se duoc update, con ko thi se tiep tuc so sanh
    public int GetMinimum()
    {
        int lowGrade = grades[0];
        for(int grade : grades)
        {
            if(grade < lowGrade)
            {
                lowGrade = grade;
            }
        }
        return lowGrade;
    }

    //Tim gia tri lon nhat
    public int GetMaximum()
    {
        int highGrade = grades[0];
        for(int grade : grades)
        {
            if(grade > highGrade)
            {
                highGrade = grade;
            }
        }

        return highGrade;
    }

    //tinh gia tri trung binh
    public double GetAverage()
    {
        //tinh tong 
        int total = 0;
        for(int grade : grades)
        {
            total += grade;
        }

        //tinh va tra ve gia tri trung binh
        return (double)total/grades.length;
    }

    //Hien thi gia tri tung sinh vien
    public void outputGrades()
    {
        System.out.printf("The grade are:%n%n");
        for(int student = 0 ; student < grades.length ; student++)
        {
            System.out.printf("Student %2d: %3d%n",student + 1,grades[student]);
        }
    }

    public void outputBarChart()
    {
        System.out.println("Pho diem: ");

        //tao 11 mang dem
        int[] frequency = new int[11];

        //tinh toan tan so trong khoang
        for(int grade: grades)
        {
            ++frequency[grade / 10];
        }

        //Bay gio chung ta bieu dien chart
        //dau tien bieu dien range; Luu y : range = 100 dac biet chi co 100 thoi
        for(int count = 0; count < frequency.length; count++)
        {
            if(count == 10)
            {
                System.out.printf("%5d:",100);
            }
            else
            {
                //bat dau x0-x9
                System.out.printf("%02d-%02d:",count*10,count*10+9);
            }
            
            //trong luc hien thi range chung ta hien thi tan so luon. 1 tan so la 1*
            for(int stars = 0; stars < frequency[count] ; stars++)
            {
                System.out.print("*");
            }

            //moi 1 range chung ta phai xuong hang 
            System.out.println();
        }
    }
}
