package Practice_In_Class.chuong_2.thuchanh2;

import java.awt.DisplayMode;

import Practice_In_Class.chuong_2.thuchanh_1.Time1;

public class Time2Test {
    

    public static void main(String[] args) {
        Time2 t1 = new Time2();
        Time2 t2 = new Time2(2);
        Time2 t3 = new Time2(21,34);
        Time2 t4 = new Time2(12,25,42);
        Time2 t5 = new Time2(t4);
        
        System.out.println("Cac khoi tao la: ");
        DisplayTime("t1 : Mac dinh tat ca: " , t1);
        DisplayTime("t2 : Chi cai dat gio: " , t2);
        DisplayTime("t3 : Chi cai dat gio va phut: " , t3);
        DisplayTime("t4 : Cai dat day du gio,phut,giay: " , t4);
        DisplayTime("t5 : Sao chep cai t4: " , t5);

        try{
            Time2 t6 = new Time2(27,74,99);
        }catch(IllegalArgumentException e)
        {
            System.out.printf("~Canh cao trong qua trinh thiet lap t6: %s%n",e.getMessage());
        }
    }

    //Khai bao ham displayTime
    private static void DisplayTime(String header , Time2 t)
    {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n ",header,t.toUniversalString(),t.toString());
        System.out.println();
    }
}
