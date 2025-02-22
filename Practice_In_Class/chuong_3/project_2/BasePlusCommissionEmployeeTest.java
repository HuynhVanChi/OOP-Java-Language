package Practice_In_Class.chuong_3.project_2;

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Huynh", "Van Chi", "555-555-555", 6000, .06, 400);

        System.out.println(" Thong tin nhan vien nhu sau: ");

        System.out.printf("%n%s%s%n","Ho nhan vien: ",employee.getFirstName());
        
        System.out.printf("%n%s%s%n","Ten nhan vien: ",employee.getLastName());
        
        System.out.printf("%n%s%s%n", "So bi mat cua nhan vien: ", employee.getSecurityNumber());
        
        System.out.printf("%s%.2f%n","Doanh thu theo tuan la: ",employee.getGrossSales());
        
        System.out.printf("%s%.2f%n","Ty le hoa hong la: ",employee.getCommissionRate());
        
        System.out.printf("%s%.2f%n" , "Luong cung la: " , employee.getBaseSalary());

        System.out.printf("%s%.2f%n", "Doanh thu la: ", employee.earnings());

        //Dat lai gia tri luong co ban
        employee.setBaseSalary(20000);
        System.out.printf("%n%s:%n%n%s%n "," Cap nhat thong tin hien thi qua toString ", employee.toString());
    }
}
