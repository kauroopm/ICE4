/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the
 * code should remember to add themselves as a modifier.
 *
 * @author dancye, 2018
 */
public abstract class Card {

    //default modifier for child classes
    protected int rank;//represents the rank of a card
    protected int suit;//represents the suit of a card
    protected int value;//represents the value of a card
    protected static String[] ranks = {"Joker", "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    protected static String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

    public int getRank() {
        return rank;
    }

    /*
     * Returns the suit of a card.
     */
    public int getSuit() {
        return suit;
    }

    /*
     * Returns the value of a card. If a jack, queen, or king the value is ten. Aces are 11 for now.
     */
    public int getValue() {
        if (rank > 10) {
            value = 10;
        } else if (rank == 1) {
            value = 11;
        } else {
            value = rank;
        }
        return value;
    }

    /*
     * Sets the value of a card.
     */
    public void setValue(int set) {
        value = set;
    }

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a
     * regular playing card etc.
     */
    @Override
    public abstract String toString();

}
