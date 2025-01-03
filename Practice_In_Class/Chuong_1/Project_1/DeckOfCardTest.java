package Practice_In_Class.Chuong_1.Project_1;

public class DeckOfCardTest {
    public static void main(String[] args) {
        DeckOfCards myDeckCards = new DeckOfCards();
        myDeckCards.shuffle();

        for(int i = 1; i <= 52; i++)
        {
            System.out.printf("%-19s" , myDeckCards.dealCard());

            if(i % 4 == 0) //output a newline after every fourth card
            {
                System.out.println();
            }
        }
    }
}
