package Practice_In_Class.chuong_2.thuchanh_1;

public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1();

        //Hien thi truoc khi dat thoi gian
        displayTime("Truoc khi cai dat thoi gian", time);
        System.out.println();

        //Cai dat thoi gian
        time.setTime(13, 27, 6);
        displayTime("Sau khi cai dat thoi gian",time);
        System.out.println();

        //Bay gio thu test thoi gian ko hop le
        try {
            time.setTime(99, 99, 99);
        } catch (IllegalArgumentException e) {
            System.out.printf("Canh bao: %s%n%n" ,e.getMessage());
        }
        displayTime("Sau khi chung ta thiet lap thoi gian sai",time);
    }

    //Khai bao ham displayTime
    private static void displayTime(String header , Time1 t)
    {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n ",header,t.toUniversalString(),t.toString());
    }
}
