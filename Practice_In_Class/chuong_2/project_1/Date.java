package Practice_In_Class.chuong_2.project_1;

public class Date {
    private int month; // 1-12
    private int day; //1-31 based on month
    private int year; //any year

    //cung cấp thông tin giới hạn số ngày theo tháng
    private static final int[] daysPerMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    
    //Khởi tạo - contructor
    public Date(int month , int day, int year)
    {
        //check tháng 1-12
        //Dùng tư duy ngược nhé!
        if(month <= 0 || month >12)
        {
            throw new IllegalArgumentException("Thang ("+ month +") Phai la 1 - 12");
        }
        if(day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
        {
            throw new IllegalArgumentException("Ngay("+ day +") Nam ngoai gioi han cho phep month va year");
        }

        //Check năm nhuận có 29 ngày
        //phương phám tìm năm nhuận là năm đó chia hết đồng thời cho 4 và cho 100
        if(month == 2 && day == 29 && !(year%400 == 0 || (year%4 == 0 && year%100 != 0)))
        {
            throw new IllegalArgumentException("Day ("+ day +") Nam ngoai gioi han cho phep month va year");
        }
        this.month = month;
        this.day = day;
        this.year = year;
        System.out.printf("Thiep lap ban dau cho ngay la: %s%n", this);
    }

    //Hiện thị theo chuẩn
    public String toString()
    {
        return String.format("%d/%d/%d",month,day,year);
    } 
}
