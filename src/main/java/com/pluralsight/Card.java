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
    public String getValue() {

        if (isFaceUp) {

            return value;
        } else {
            return "#";
        }


    }
    public int getPointValue() {

        if (isFaceUp) {

            if(this.value.equals("A")){
                return 11;
            }else if(this.value.equals("k")){
                return 10;
            }else{
                return Integer.parseInt(this.value);
            }

        } else {
            return 0;
        }
    }
    public boolean isFaceUp(){
        return isFaceUp;
    }
    public void flip(){
        isFaceUp = !isFaceUp;
    }
}



