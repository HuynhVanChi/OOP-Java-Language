package Practice_In_Class.Buoi1.Thuchanh4;

import java.security.SecureRandom;

public class DeckOfCards {
    //Khai bao so luong la bai
    private static final  int NUMBER_OF_CARDS = 52;
    //Khai bao ngau nhien
    private static final SecureRandom randomNumbers = new SecureRandom();
    
    private  Card[] deck = new Card[NUMBER_OF_CARDS];
    private  int currentCard = 0;

    //khoi tao bai
    public DeckOfCards()
    {
        String[] faces = {"At" , "Hai" , "Ba" , "Bon" , "Nam" , "Sau" , "Bay" , "Tam" , "Chin" , "Muoi" , "J" , "Q" , "K"} ;
        String[] suits = {"Co" , "Ro" , "Bich" , "Nhep"};

        //dest [52] = Card(13*4)
        for(int count = 0; count < deck.length; count++)
        {
            deck[count] = new Card(faces[count % 13] , suits[count / 13]);
        }
    }

    //Giai thuat chia bai
    public void shuffle()
    {
        //giai thuat buoc 3 chay 1 toi 52
        for(int first = 0; first < deck.length; first++)
        {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    //tra ve gia tri sau khi chia bai
    //buoc 4
    public Card dealCard()
    {
        if(currentCard < deck.length)
        {
            return  deck[currentCard++];
        }
        else
        {
            return null;
        }
    }
}
