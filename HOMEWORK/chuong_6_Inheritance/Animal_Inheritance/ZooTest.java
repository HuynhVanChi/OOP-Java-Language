package HOMEWORK.chuong_6_Inheritance.Animal_Inheritance;

public class ZooTest {
    public static void main(String[] args) {
        //Object
        dog myDog = new dog("Kiki",200,10,5,true,"Corgi");
        spider mySpider = new spider("Spider-man", 2, 3, 20, 20, false);
        
        //Dog
        myDog.eat("sauces");
        myDog.move(20);
        myDog.bark();
        System.out.println(myDog.getAge());

        //Spider
        mySpider.eat("insects");
        mySpider.move(3);
        mySpider.setNAME("Venom");
        System.out.println(mySpider.getNAME());
    }
}
