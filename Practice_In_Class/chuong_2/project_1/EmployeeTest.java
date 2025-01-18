package Practice_In_Class.chuong_2.project_1;

public class EmployeeTest {
    public static void main(String[] args) {
        Date sinhnhat = new Date(3,12,1985);
        Date ngaythue = new Date(3,12,2021);
        Employee employee = new Employee("Nguyen", "Van A", sinhnhat, ngaythue);
        System.out.println(employee);
    }
}
