package com.pluralsight;


import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class MainApp {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();

        homeScreen();

        System.out.print("Please enter Player 1's name: ");
        String player1name = scanner.nextLine();

        System.out.print("Please enter Player 2's name: ");
        String player2name = scanner.nextLine();


        dealInitialCards(deck, hand1, hand2);


        System.out.println("\n" + player1name + "'s hand:");
        displayHand(hand1);
        System.out.println(player1name + "'s total: " + hand1.getValue());

        System.out.println("\n" + player2name + "'s hand:");
        displayHand(hand2);
        System.out.println(player2name + "'s total: " + hand2.getValue());


        determineWinner(player1name, hand1, player2name, hand2);

        scanner.close();
    }

    public static void dealInitialCards(Deck deck, Hand hand1, Hand hand2) {
        deck.shuffle();
        for (int i = 0; i < 2; i++) {
            hand1.addCard(deck.deal());
            hand2.addCard(deck.deal());
        }
    }

    public static void displayHand(Hand hand) {
        for (Card card : hand.getCards()) {
            System.out.println("- " + card.getValue() + " of " + card.getSuit());
        }
    }


    public static void determineWinner(String player1name, Hand hand1, String player2name, Hand hand2) {
        int player1Total = hand1.getValue();
        int player2Total = hand2.getValue();

        System.out.println("\n===============================");
        if (player1Total > 21 && player2Total > 21) {
            System.out.println("Both players busted! No winner.");
        } else if (player1Total > 21) {
            System.out.println(player1name + " busted! " + player2name + " wins!");
        } else if (player2Total > 21) {
            System.out.println(player2name + " busted! " + player1name + " wins!");
        } else if (player1Total > player2Total) {
            System.out.println(player1name + " wins with " + player1Total + "!");
        } else if (player2Total > player1Total) {
            System.out.println(player2name + " wins with " + player2Total + "!");
        } else {
            System.out.println("It's a tie! Both have " + player1Total + "!");
        }
        System.out.println("===============================");
    }

    public static void homeScreen() {
        System.out.println(" Welcome to Blackjack ");
        System.out.println("==========================");
    }
}
