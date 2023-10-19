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
        System.out.println(cardList.size());
        System.out.println(cardList.contains(new Card(2,"Clubs")));








    }
}
