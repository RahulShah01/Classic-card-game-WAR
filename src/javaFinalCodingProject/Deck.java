/*
 * 1b. Deck Class. 
 * Deck class is created below. 
 * Deck class has list of card field called cards, which hold all the cards in the deck.  
 *   
 */

package javaFinalCodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

  List<Card> cards = new ArrayList<Card>();
  
  /*
   * Constructor for Deck class is created below. 
   * This instantiates all 52 cards and populates the cards field and adds them to the card list.
   *
   */
  
  Deck(){
    //Unicode for each suit symbol written along side each suit. 
    
    String[] suits = {"Clubs \u2663","Diamonds \u2666", "Hearts \u2665", "Spades \u2660"}; 
    String[] numbers = {"Two" ,"Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    
    for(String suit : suits) {
      int count = 2;
       for(String number : numbers) {
       Card card = new Card(number, suit, count);
       this.cards.add(card);
       count ++;
      }
    }
  }
    
  // The describe method below prints out all the cards in the deck. 
  
  public void describe() {
    for (Card card : this.cards) {
      card.describe();
    }
  }
  
  // The shuffle method below randomizes the order of the cards. 
  
  public void shuffle() {
    Collections.shuffle(this.cards);
  }
  
  /**
   * The draw method below removes the top card of the cards field.
   * @return returns the removed top card from the list of card.
   */
  
  public Card draw() {
    Card card = this.cards.remove(0);
    return card;
   }
}
