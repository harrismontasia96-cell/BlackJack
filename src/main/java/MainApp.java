package com.pluralsight;

import java.util.Scanner;

public class MainApp {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Deck deck = new Deck();
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();

        homeScreen();
        System.out.println("please enter player 1's name");
        String player1name = scanner.nextLine();

        System.out.println("please enter player 2's name");
        String player2name = scanner.nextLine();

        deck.shuffle();


        for (int i = 0; i < 5; i++) {
            hand1.addCard(deck.deal());
            hand2.addCard(deck.deal());
        }
        System.out.println(player1name + "'s hand is worth " + hand1.getValue());
        System.out.println(player2name + "'s hand is worth " + hand2.getValue());

        scanner.close();
    }

    public static void homeScreen() {
        System.out.println("Welcome to Black Jack");
    }
}
