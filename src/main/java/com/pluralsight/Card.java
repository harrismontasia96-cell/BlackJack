package com.pluralsight;

public class Card {

    private String suit, value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }
    public String getSuit(){

        if(isFaceUp){
            return suit;
        } else {
            return  "#";
        }
    }
    public String getValue(){

        if(isFaceUp){

            return value;
        } else {
            return "#";
        }
    }
    public int getPointValue() {

        if (isFaceUp) {

            return 1;
        } else {
            return "0";
        }
    }
    public boolean isFaceUp(){
        return isFaceUp;
    }
    public void flip(){
        isFaceUp = !isFaceUp;
    }
}



