import java.util.Objects;

public class Card {
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

        if(cardType.equals(this.type)){
            System.out.print("Same type");
            System.out.println();
        }
        if(cardNumber==(this.number)){
            System.out.println("Same number");
           // System.out.print();
        }

        boolean isSame = cardType.equals(this.type)|| cardNumber==(this.number);
        return isSame;

    }
}

