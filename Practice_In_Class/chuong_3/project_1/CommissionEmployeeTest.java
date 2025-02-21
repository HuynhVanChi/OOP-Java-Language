package Practice_In_Class.chuong_3.project_1;

public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee("Huynh", "Van Chi", "888-666-0000", 40000, 0.97);
        
        //Bay gio chung ta test tung lenh
        System.out.println("Thong tin nhan vien nhu sau: ");
        
        System.out.printf("%n%s%s%n","Ho nhan vien: ",employee.getFirstName());
        
        System.out.printf("%n%s%s%n","Ten nhan vien: ",employee.getLastName());
        
        System.out.printf("%n%s%s%n", "So bi mat cua nhan vien: ", employee.getSecurityNumber());
        
        System.out.printf("%s%.2f%n","Doanh thu theo tuan la: ",employee.getGrossSales());
        
        System.out.printf("%s%.2f%n","Ty le hoa hong la: ",employee.getCommissionRate());
        
        System.out.printf("%s%.2f%n", "Doanh thu la: ", employee.earnings());

        //Sau day chung ta cho cac gia tri doanh thu va ty le hoa hong 
        employee.setGrossSales(6000);
        employee.setCommissionRate(.5);

        System.out.printf("%n%s:%n%n%s%n","Hien thi thong tin bang cach su dung toString()",employee);
    }
}
