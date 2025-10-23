package com.pluralsight;

public class Card {
    private String suit, value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = true;
    }
    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }
    public int getPointValue() {
        switch (value) {
            case "J":
            case "Q":
            case "K":
                return 10;
            case "A":
                return 11;
            default:
                return Integer.parseInt(value);
        }
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
