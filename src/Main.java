import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        CardDeck cardDeck=new CardDeck();


        System.out.println();
        Card card1=new Card(2,"Hearts");
        Card card2 = cardDeck.getCard(7);
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card1.compareTo(card2));

      //  cardDeck.sortCardDeck();



    }

    private static void checkIfEqual(List<Card> cardList, Card card1) {


        for (int indexOfCards = 0; indexOfCards < cardList.size(); indexOfCards++) {
            System.out.println(cardList.get(indexOfCards));
            if (cardList.get(indexOfCards).getType().equals(card1.getType())){
                 System.out.println("Same type");
            }
            if(cardList.get(indexOfCards).getNumber()==card1.getNumber()){
                System.out.println("Same number");
            }
        }
    }
}

