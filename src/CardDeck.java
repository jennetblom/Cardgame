import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CardDeck {


    private List<Card> cardDeck = new ArrayList<>();


    public CardDeck() {

        String[]cardType = {"Hearts","Diamonds","Spades","Clubs"};

        for(String type:cardType){
            for(int number=1;number<=13;number++){
                cardDeck.add(new Card(number,type));
                System.out.println(new Card(number,type));;
            }
        }
    }
    public Card getCard(int index){
        return cardDeck.get(index);
    }

    public void sortCardDeck(){
        Collections.sort(cardDeck);
        for(Card card:cardDeck){
            System.out.println(card);
        }
    }
}
