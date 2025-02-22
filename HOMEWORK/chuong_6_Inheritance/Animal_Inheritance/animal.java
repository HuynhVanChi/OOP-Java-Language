package HOMEWORK.chuong_6_Inheritance.Animal_Inheritance;

public class animal {
    //thuộc tính (attributes) của animal
    private String name;
    private int size;
    private int weight;
    private int age;
    
    //constructor animal
    public animal(String name, int size, int weight, int age)
    {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.age = age;
    }

    //Tạo hàm Setter và Getter cho (attributes)
    public void setNAME(String name)
    {
        this.name = name;
    }
    public String getNAME()
    {
        return name;
    }

    public void setSIZE(int size)
    {
        this.size = size;
    }
    public int getSIZE()
    {
        return size;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }
    public int getWeight()
    {
        return weight;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }

    //Method của Animal
    public void  eat(String fool)
    {
        System.out.printf("The %s is eating %s!\n" , getNAME() , fool);
    }

    public void move(int speed)
    {
        System.out.printf("The %s is moving %d km/h!\n" , getNAME() , speed);
    }
}
