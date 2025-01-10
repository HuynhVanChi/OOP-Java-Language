package Practice_In_Class.chuong_2.thuchanh2;

public class Time2 {
    private int hour; //0 -23
    private int minute; //0 - 59
    private int second; // 0-59

    //co 5 cai theo bang tren
    public Time2()
    {
        this(0,0,0);
    }
    public Time2(int hour)
    {
        this(hour,0,0);
    }
    public Time2(int hour,int minute)
    {
        this(hour,minute,0);
    }

    public Time2(int hour,int minute,int second)
    {
        //check tung gia tri
        if(hour < 0 || hour >=24)
        {
            throw new  IllegalArgumentException("hour must be 0-23");
        }
        if(minute < 0 || minute >=60)
        {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        if(second < 0 || second >= 60)
        {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time2(Time2 time)
    {
        this(time.hour, time.minute,time.second);
    }

    //Phan 2: Cai dat Time(Set methods)
    public void setTIme(int hour,int minute,int second)
    {
        //check tung gia tri
        if(hour < 0 || hour >=24)
        {
            throw new  IllegalArgumentException("hour must be 0-23");
        }
        if(minute < 0 || minute >=60)
        {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        if(second < 0 || second >= 60)
        {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour)
    {
        //check tung gia tri
        if(hour < 0 || hour >=24)
        {
            throw new  IllegalArgumentException("hour must be 0-23");
        }
        this.hour = hour;
    }

    public void setMinute(int minute)
    {
        if(minute < 0 || minute >=60)
        {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        this.minute = minute;
    }

    public void setSecond(int second)
    {
        if(second < 0 || second >= 60)
        {
            throw new IllegalArgumentException("second must be 0-59");
        }
        this.second = second;
    }

    //Phan 3 : doc gia tri(get methods)
    public int getHour(){return hour;}
    public int getMinute(){return minute;}
    public int getSecond(){return second;}

    //Phan 4: Hien thi theo chuan quoc te va thong thuong
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
