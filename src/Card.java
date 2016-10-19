
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class Card {
    // constants
    public static final int SPADES = 0;
    public static final int HEARTS = 1;
    public static final int CLUBS = 2;
    public static final int DIAMONDS = 3;
    
    // ranks for face cards
    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    
    // instance variables
    private int suit;
    private int rank;
    private Color colour;
    private boolean faceUp;

    /**
     * a constructor to create a new playing card
     * @param rank the rank of the playing card
     * @param suit the suit of the playing card
     * @param faceUp is the card face up 
     */
    public Card(int rank, int suit, boolean faceUp) {
        // initalizing instance variables
        this.rank = rank;
        this.suit = suit;
        this.faceUp = faceUp;
        // colour
        if(this.suit == Card.SPADES || this.suit == Card.CLUBS){
            colour = Color.BLACK;
        } else {
            colour = Color.RED;
        }
    }

    /**
     * a constructor to create a new playing card
     * @param rank the rank of the playing card
     * @param suit the suit of the playing card
     */
    public Card(int rank, int suit) {
        // initalizing instance variables
        this.rank = rank;
        this.suit = suit;
        // colour
        if(this.suit == Card.SPADES || this.suit == Card.CLUBS){
            colour = Color.BLACK;
        } else {
            colour = Color.RED;
        }
    }
    
    // accessor methods
    /**
     * Compares the rank of 2 cards
     * @param a the card to compare rank with
     * @return 0 means the cards are equivalent, 
     *         less than 0 card is less than a, 
     *         greater than than 0 card is bigger than a
     */
    public int compareTo(Card a) {
        return this.rank - a.rank;
    }
    
    /**
     * Returns the suit of the playing card
     * @return the suit of the playing card
     */
    public int getSuit() {
        return this.suit;
    }

    /**
     * Returns the rank of the playing card
     * @return the rank of the playing card
     */
    public int getRank() {
        return this.rank;
    }

    /**
     * Returns the color of the playing card
     * @return the color of the playing card: RED or BLACK
     */
    public Color getColour() {
        return this.colour;
    }
    
    /**
     * Returns if the face of the card is up
     * @return true if the playing card is face up 
     */
    public boolean isFaceUp() {
        return this.faceUp;
    }
    
    /**
     * method to flip the card from face up to face down or vica-versa
     */
    public void flipCard(){
        /*if(faceUp){
            faceUp = false;
        } else {
            faceUp = true;
        }*/
        // better way to do it
        // called a toggle
        faceUp = !faceUp;
    }
    
     /**
      * Pretty String version of the card
      * @return a String representation of the card
      */
    @Override
    public String toString(){
        String suit = "";
        if(this.suit == Card.SPADES){
            suit = "Spades";
        } else if(this.suit == Card.CLUBS){
            suit = "Clubs";
        } else if(this.suit == Card.HEARTS){
            suit = "Hearts";
        } else {
            suit = "Diamonds";
        }
        return "Suit: " + suit + " Rank: " + this.rank + " FaceUp: " + this.faceUp;
        
    }
}
