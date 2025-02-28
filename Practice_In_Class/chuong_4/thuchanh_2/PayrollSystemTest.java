package Practice_In_Class.chuong_4.thuchanh_2;

public class PayrollSystemTest {
    public static void main(String[] args) {
        
        SalariedEmployee salariedEmployee = new SalariedEmployee("Huynh ", "Van Chi", "111-11-1111", 800.00);
        
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Tran ", "Van Tri", "22-22-2222", 16.75, 40);

        CommissionEmployee commissionEmployee = new CommissionEmployee("Dao ", "Van Khang", "333-33-3333", 10000, .06);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Hoang ", "Van Dung", "444-44-4444", 5000, .04, 300);

        System.out.println("Nhan vien se duoc xu ly doc lap:");

        System.out.printf("%n%s%n%s:$%,.2f%n%n",salariedEmployee,"earned",salariedEmployee.earnings());

        System.out.printf("%s%n%s:$%,.2f%n%n",hourlyEmployee,"earned",hourlyEmployee.earnings());

        System.out.printf("%s%n%s:$%,.2f%n%n",commissionEmployee,"earned",commissionEmployee.earnings());

        System.out.printf("%s%n%s:$%,.2f%n%n",basePlusCommissionEmployee,"earned",basePlusCommissionEmployee.earnings());

        //Bam Run de xem ket qua

        //Bay gio chung ta xu dung da hinh vao xu ly
        //tao mang cho 4 nhan vien tu super class Employee

        Employee[] employees =new Employee[4];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        //System.out.println("Nhan vien se duoc xu ly theo da hinh Polymorphism: ")
        //Bay gio chung ta xu ly them yeu cau
        //Doi voi bat ky tra luong hien tai, cong ty da quyet dinh thuong cho nhan vien huong hoa hong
        //huong luong co ban bang cach them 1-% vao luong co ban cua ho

        System.out.println("--------------------------");
        System.out.println("Nhan vien se duoc xu ly theo da hinh Polymorphism:");
        for(Employee currentEmployee:employees)
        {
            System.out.println(currentEmployee);
            if(currentEmployee instanceof BasePlusCommissionEmployee)
            {
                //Tham chieu nhan vien downcast den
                //tham chieu BasePlusCommissionEmployee
                BasePlusCommissionEmployee employee =(BasePlusCommissionEmployee)currentEmployee;
                employee.setBaseSalary(1.10*employee.getBaseSalary());
                System.out.printf("Nhan vien duoc thuong voi 10%% la: $%,.2f%n",employee.getBaseSalary());
            }
            System.out.printf("Thu nhap: $%,.2f%n%n", currentEmployee.earnings());
        }

        //Bay gio hien thi danh sach nhan vien trong array employee
        for(int j = 0; j < employees.length;j++)
        {
            System.out.printf("Nhan vien %d thuoc dang %s%n", j , employees[j].getClass().getName());
        }
    }
}
