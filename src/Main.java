import java.util.ArrayList;
import java.util.List;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        CardDeck cardDeck=new CardDeck();

        cardDeck.getCardDeck().get(1).getNumber();



        //System.out.println(cardDeck.getCardDeck());

//        List
//        Card card1 = new Card(10, "Hearts");
//        checkIfEqual(cardList, card1);

    }
//
//    private static List cardList() {
//
////
////        List<Card> cardList = new ArrayList<>();
////        for (int number = 1; number <= 13; number++) {
////            cardList.add(new Card(number, "Clubs"));
////            cardList.add(new Card(number, "Diamonds"));
////            cardList.add(new Card(number, "Hearts"));
////            cardList.add(new Card(number, "Spades"));
////        }
////        return cardList;
//    }

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

