import java.util.Objects;

public class Card implements Comparable<Card>{
    private int number;
    private String type;

    public Card(int number, String type) {
        this.number = number;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, type);
    }

    @Override
    public String toString() {
        return "Number: "+ number + " Type: "+getType();
    }

    @Override
    public boolean equals(Object obj) {

        Card card = (Card)obj;
        String cardType = card.getType();
        int cardNumber = card.getNumber();


        boolean isSame = cardType.equals(this.type)|| cardNumber==(this.number);
        return isSame;

    }

    @Override
    public int compareTo(Card other) {
        if(this.number>other.number){
            return 1;
        }
        else if(this.number<other.number){
            return -1;
        }
        else{
            return 0;
        }

    }
}

