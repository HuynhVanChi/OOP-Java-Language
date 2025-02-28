package Practice_In_Class.chuong_4.thuchanh_1;

public class PolymorphismTest {
    public static void main(String[] args) {
        //Thiết lập superclass --> CommissionEmployee --> Có 5 thông số 
        CommissionEmployee commissionEmployee = new CommissionEmployee("Huynh", "Van Chi", "222-22-2222", 10000,.06);

        //Thiết lập subclass --> BasePlusCommisionEmployee --> có 6 thông số 
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Huynh", "Van Tri", "333-33-3333", 5000, .04, 3000);

        //gọi toString trên đối tượng lớp super bằng cách sử dụng biến lớp super
        System.out.printf("%s%s:%n%n%s%n%n","Call CommissionEmployee's toString with superclass reference","to superclass object",commissionEmployee.toString());

        //gọi toString trên đối tượng lớp con bằng cách sử dụng biến lớp con
        System.out.printf("%s%s:%n%n%s%n%n", "Call CommissionEmployee's toString with superclass subclass","reference to subclass object", basePlusCommissionEmployee.toString());

        //Bây giờ chúng ta dùng superclass CommissionEmployee để hiện thị subclass basePlusCommissionEmployee như sau
        CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;
        System.out.printf("%s%s:%n%n%s%n","Call CommissionEmployee's toString with superclass reference","reference to subclass object",commissionEmployee2.toString());
    }
}
