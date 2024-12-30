package Practice_In_Class.Buoi1.Thuchanh4;

public class Card {
    private final  String face;
    private final  String suit;

    //Khoi tao voi tham so vao
    public Card(String cardFace , String cardSuit)
    {
        this.face = cardFace;
        this.suit = cardSuit;
    }

    //tra ve chuoi bieu dien cua la vai
    public String toString()
    {
        return  face + " of " + suit;
    }
}
