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
    public boolean equals(Object obj) {
//        Person person = (Person)obj;
//
//        String personName= person.getName();
//        boolean isSame= personName.equals(this.name);
//        return isSame;

        Card card = (Card)obj;
        String cardType = card.getType();
        int cardNumber = card.getNumber();

        boolean isSame = cardType.equals(this.type)&& cardNumber==(this.number);
        return isSame;
    }
}

