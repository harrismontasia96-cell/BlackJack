package com.pluralsight;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand(){
        cards = new ArrayList<>();

    }
    public void addCard(Card card) {
        cards.add(card);
    }
    public ArrayList<Card> getCards() {
        return cards;
    }


    public int getValue() {
        int total = 0;
        int aceCount = 0;

        for (Card card : cards) {
            total += card.getPointValue();
            if (card.getValue().equals("A")) {
                aceCount++;
            }
        }
        while (total > 21 && aceCount > 0) {
            total -= 10; // Switch an Ace from 11 to 1
            aceCount--;
        }
        return total;
    }
    public void showHand(String playerName) {
        System.out.println(playerName + "'s cards:");
        for (Card card : cards) {
            System.out.println("  " + card);
        }
        System.out.println("Total value: " + getValue());
        System.out.println();
    }
}







