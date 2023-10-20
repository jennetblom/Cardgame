import java.util.ArrayList;
import java.util.List;

public class CardDeck {


    private List<Card> cardDeck = new ArrayList<>();



    public CardDeck() {

        String[]cardType = {"Hearts","Diamonds","Spades","Clubs"};

        for(String type:cardType){
            for(int i=1;i<=13;i++){
                cardDeck.add(new Card(i,type));
            //    System.out.println(new Card(i,type));;
            }
        }
    }

    public List<Card> getCardDeck() {
        return cardDeck;
    }

    public void setCardDeck(List<Card> cardDeck) {
        this.cardDeck = cardDeck;
    }
}
