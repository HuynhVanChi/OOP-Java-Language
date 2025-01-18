package Practice_In_Class.chuong_2.project_1;

public class EmployeeTest_2 {
    public static void main(String[] args) {
        System.out.printf("So luong employee truoc khi thiet lap: %d%n",Employee.getCount());
        //tạo 2 employee như sau
        Date birth1 = new Date(7,24,1949);
        Date hire1 = new Date(3,12,1988);
        Employee e1 = new Employee("Nguyen", "Van A", birth1, hire1);

        System.out.println("");
        Date birth2 = new Date(1,2,1999);
        Date hire2 = new Date(4,1,2008);
        Employee e2 = new Employee("Tran", "Van B", birth2, hire2);
        
        System.out.println("");
        System.out.println(e1);
        System.out.println(e2);
        System.out.printf("So luong employee sau khi thiet lap: %d%n" , Employee.getCount());
    }
}
