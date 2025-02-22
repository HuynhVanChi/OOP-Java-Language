package HOMEWORK.chuong_6_Inheritance.Animal_Inheritance;

public class spider extends animal {
    //thuộc tính (attributes) của spider
    private int legs;
    private boolean poison;

    //Constructor spider
    public spider(String name , int size , int weight, int age , int legs , boolean  poison)
    {
        super(name, size, weight, age);
        this.legs = legs;
        this.poison = poison;
    }

    //Tạo hàm Setter và Getter
    public void setLegs(int legs)
    {
        this.legs = legs;
    }
    public int getLegs()
    {
        return legs;
    }

    public void setPoison(boolean poison)
    {
        this.poison = poison;
    }
    public boolean isPoison()
    {
        return poison;
    }

    //Method
    public void attack()
    {
        System.out.println("The spider is attacking!");
    }
}
