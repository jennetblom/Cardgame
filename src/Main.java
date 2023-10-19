import java.util.ArrayList;
import java.util.List;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        List<Card> cardList=new ArrayList<>();


        for(int number=1; number<=13;number++){
            cardList.add(new Card(number,"Clubs"));
            cardList.add(new Card(number,"Diamonds"));
            cardList.add(new Card(number,"Hearts"));
            cardList.add(new Card(number,"Spades"));
        }


        Card card1= new Card(1,"Hearts");

        System.out.println(cardList.get(2));

        if(cardList.get(2).equals(card1))
        {
            System.out.println("They are the same");
        }



    }
}
