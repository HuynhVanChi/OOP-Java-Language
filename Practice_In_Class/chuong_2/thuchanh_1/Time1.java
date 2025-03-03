package Practice_In_Class.chuong_2.thuchanh_1;

public class Time1
{
    private int hour; // 0 - 23
    private int minute; //0 -59
    private  int second; // 0 - 59

    //Dat thoi gian va kiem tra
    public void setTime(int hour , int minute , int second)
    {
        if(hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60)
        {
            throw new IllegalArgumentException("hour,minute and/or second was out of range") ;
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //Hien thi theo chuan quoc te
    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d" ,hour , minute , second);
    }

    //Hien thi theo chuan
    public String toString()
    {
        return String.format("%d:%02d:%02d%s",((hour == 0 || hour == 12)?12:hour%12), minute , second , (hour <12?" AM":" PM"));
    }
}