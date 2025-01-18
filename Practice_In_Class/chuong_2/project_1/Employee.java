package Practice_In_Class.chuong_2.project_1;

import java.util.Stack;

public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    private static int count = 0;

    //Khởi tạo nhân viên 
    public Employee(String firstName , String lastName , Date birthDate , Date hireDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        ++count;
    }

    //Hiển thị thông tin
    public String toString()
    {
        return String.format("%s , %s Hired: %s Birthday: %s", lastName,firstName,hireDate,birthDate);
    }

    //Đọc giá trị đến - count
    public static int getCount()
    {
        return count;
    }
    
}
