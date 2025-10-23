package com.pluralsight;

import java.util.Scanner;

public class MainApp {
        public static void main(String[] args) {
            public static final Scanner scanner = new Scanner(system.in);

            Deck deck = new Deck();
            Hand hand1 = new Hand();

            homescreen();
            System.out.println("please enter player 1's name");
            String player1name = scanner.nextLine();

            System.out.println("please enter player 2's name");
            String player2name = scanner.nextLine();


            for(int i = 0; i < 5; i++) {

                Card Card = deck.deal();

                hand1.deal(card);
            }
            int handValue = hand1.getValue();
            System.out.println("This hand is worth " + handValue);
        }


    }
