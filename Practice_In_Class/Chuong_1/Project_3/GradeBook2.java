package Practice_In_Class.Chuong_1.Project_3;

public class GradeBook2 {
    
    private String courseName;
    private int[][] grades;

    //Khoi tao
    public GradeBook2(String courseName , int[][] grades)
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
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",GetMinimum(),GetMaximum());

        //Bieu dien duoi dang chart
        outputBarChart();
    }
    
    //tim gia tri nho nhat
    //Phuong phap: lay gia tri dau tien khoi tao nho nhat sau do so sanh tu dau den cuoi
    //phan tu nao be hon thi se duoc update, con ko thi se tiep tuc so sanh
    public int GetMinimum()
    {
        int lowGrade = grades[0][0];
        for(int[] studentGrades : grades)
        {
            for(int grade : studentGrades)
            {
                if(grade < lowGrade)
                {
                    lowGrade = grade;
                }
            }
        }
        return lowGrade;
    }

    //Tim gia tri lon nhat
    public int GetMaximum()
    {
        int highGrade = grades[0][0];
        
        for(int[] studentGrades : grades)
        {
            for(int grade : studentGrades)
            {
                if(grade > highGrade)
                {
                    highGrade = grade;
                }
            }
        }
        return highGrade;
    }

    //tinh gia tri trung binh
    public double GetAverage(int[] setOfGrades)
    {
        //tinh tong 
        int total = 0;
        for(int grade : setOfGrades)
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
        
        System.out.print("      "); //cot dau tien bo trong
        for(int test = 0; test < grades[0].length; test++)
        {
            System.out.printf("Kiem tra %d" , test + 1);    
        }

        //chen them cot trung binh
        System.out.println("Averge");
        
        for(int student = 0 ; student < grades.length ; student++)
        {
            //Cot 1, ten sinh vien
            System.out.printf("Student %2d",student + 1);

            //in diem tuong ung 
            for(int test : grades[student]) //output student's grades
            {
                System.out.printf("%12d" , test);
            }
            
            //Diem trung binh
            double average = GetAverage(grades[student]);
            System.out.printf("  %9.2f%n",average);
        }
    }

    public void outputBarChart()
    {
        System.out.println("Pho diem: ");

        //tao 11 mang dem
        int[] frequency = new int[11];

        //tinh toan tan so trong khoang
        for(int[] studentGrades : grades)
        {
            for(int grade : studentGrades)
            {
                ++frequency[grade / 10];
            }
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
