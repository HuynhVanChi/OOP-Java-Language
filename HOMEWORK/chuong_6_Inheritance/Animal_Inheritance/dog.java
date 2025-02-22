package HOMEWORK.chuong_6_Inheritance.Animal_Inheritance;

public class dog extends animal {
    //thuộc tính (attributes) của dog
    private boolean friendly;
    private String breed;

    //Constructor Dog
    public dog(String name , int size , int weight , int age ,boolean friendly, String breString)
    {
        super(name , size , weight, age);
        this.friendly = friendly;
        this.breed = breed;
    }

    //Tạo hàm Setter và Getter của (attributes)
    public void setFriendly(boolean friendly)
    {
        this.friendly = friendly;
    }
    public boolean isFriendly()
    {
        return friendly;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }
    public String getBreed()
    {
        return breed;
    }

    //Method của Dog
    public void bark()
    {
        System.out.println("The dog is barking!");
    }
}
